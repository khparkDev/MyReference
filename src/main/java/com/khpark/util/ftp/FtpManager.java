package com.khpark.util.ftp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FtpManager {
	private FTPClient ftp = null;

	public FtpManager(String host, String user, String pwd, int bufferSize) throws Exception {
		ftp = new FTPClient();
		ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
		int reply;
		ftp.connect(host);
		reply = ftp.getReplyCode();

		if (!FTPReply.isPositiveCompletion(reply)) {
			ftp.disconnect();
			throw new Exception("Exception in connecting to FTP Server");
		}

		ftp.login(user, pwd);
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		ftp.enterLocalPassiveMode();
		ftp.setBufferSize(bufferSize);
	}

	public void uploadFile(File file, String fileName, String hostDir) throws Exception {
		InputStream input = new FileInputStream(file);
		ftp.storeFile(hostDir + fileName, input);
	}

	public void downloadFile(String remoteFilePath, String filename, String localFilePath) {
		String localFile = localFilePath + filename;
		String remoteFile = remoteFilePath + filename;
		File file = new File(localFile);

		try {

			OutputStream fos = new FileOutputStream(file);
			ftp.retrieveFile(remoteFile, fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		if (ftp.isConnected()) {

			try {
				ftp.logout();
				ftp.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}