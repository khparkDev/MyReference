package com.khpark.util.ssh;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;

import org.apache.commons.lang.StringUtils;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

public class SSHCommander {
	public static final int MAC_TERMINAL_END_STR_TYPE = 1; // $ 프롬프트 
	public static final int LINUX_TERNAL_ENT_STR_TYPE = 2; // # 프롬프트
	private JSch jsch;
	private String username;
	private String host;
	private String password;
	private int osType;
	private static final int DEFAULT_SSH_PORT = 22;

	public SSHCommander(String host, String account, String password, int osType) {
		this.username = account;
		this.host = host;
		this.password = password;
		this.osType = osType;
		this.jsch = new JSch();
	}

	public boolean executeSShCommand(String command) {
		boolean result = true;

		try {
			Session session = jsch.getSession(username, host, DEFAULT_SSH_PORT);
			jsch.setKnownHosts("~/.ssh/known_hosts");
			jsch.addIdentity("~/.ssh/id_rsa");
			if (StringUtils.isEmpty(password)) {
				System.out.println("using passwordless...");
				session.setConfig("PreferredAuthentications", "publickey");
				session.setConfig("StrictHostKeyChecking", "no");
			} else {
				System.out.println("using password...");
				session.setUserInfo(new SSHUserInfo(password));
			}
			session.connect();

			Channel channel = session.openChannel("shell");
			channel.connect();

			BufferedReader dataIn = new BufferedReader(new InputStreamReader(channel.getInputStream()));
			DataOutputStream dataOut = new DataOutputStream(channel.getOutputStream());

			// send ls command to the server
			dataOut.writeBytes(command + "\r\n");
			dataOut.flush();

			// and print the response 
			String line = dataIn.readLine();
			System.out.println(line);
			while (!line.endsWith(osTypeToStr(this.osType))) {
				System.out.println(line);
				line = dataIn.readLine();
			}
			dataIn.close();
			dataOut.close();
			channel.disconnect();
			session.disconnect();

			channel.disconnect();
			session.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}

		return result;
	}

	private String osTypeToStr(int osType) {
		switch (osType) {
			case MAC_TERMINAL_END_STR_TYPE :
				// MAC
				return "$ ";
			case LINUX_TERNAL_ENT_STR_TYPE :
				// linux style
				return "# ";
			default :
				return "# ";
		}
	}

	private class SSHUserInfo implements UserInfo {
		private String password;

		public SSHUserInfo(String password) {
			this.password = password;
		}

		public String getPassword() {
			return this.password;
		}

		public String getPassphrase() {
			return null;
		}

		public boolean promptPassphrase(String arg0) {
			return false;
		}

		public boolean promptPassword(String arg0) {
			return false;
		}

		public boolean promptYesNo(String arg0) {
			return false;
		}

		public void showMessage(String arg0) {
		}
	}
}
