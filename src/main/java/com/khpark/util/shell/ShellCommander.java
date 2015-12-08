package com.khpark.util.shell;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShellCommander {
	public static ShellCommander newInstance() {
		return new ShellCommander();
	}

	public String shellCmd(String command) throws Exception {
		List<String> commands = new ArrayList<String>();
		commands.add("/bin/bash");
		commands.add("-c");
		commands.add(command);
		ProcessBuilder p = new ProcessBuilder(commands);
		Process process = p.start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		StringBuffer resultStr = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null) {
			resultStr.append(line).append("\n");
		}

		return resultStr.toString();
	}
}
