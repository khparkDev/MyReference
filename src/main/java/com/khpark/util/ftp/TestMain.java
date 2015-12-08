package com.khpark.util.ftp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestMain {

	public static void main(String... args) throws Exception {
		FtpManager fd = new FtpManager("127.0.0.1", "hicom", "hicom", 1024);

		// 다운로드
		fd.downloadFile("/", "test.txt", "d:\\");

		// 업로드
		String filename = "uploadtest.txt";
		File file = new File("d:\\" + filename);
		OutputStream os = new FileOutputStream(file);
		os.write("테스트 업로드".getBytes());
		os.close();

		fd.uploadFile(file, filename, "/");
	}
}
