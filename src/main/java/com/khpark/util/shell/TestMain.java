package com.khpark.util.shell;

/**
 * 서버에서 실행시킬때 사용하면 됨.
 */
public class TestMain {
	public static void main(String... args) throws Exception {
		ShellCommander sc = new ShellCommander();
		sc.shellCmd("ls -al");
	}
}
