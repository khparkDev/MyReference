package com.khpark.util.ssh;

/**
 * 서버에서 실행
 */
public class TestMain {

	public static void main(String[] args) {
		SSHCommander sc = new SSHCommander("d1.tmonc.net", "아이디", "비번", 2);
		sc.executeSShCommand("ls -al");
	}
}
