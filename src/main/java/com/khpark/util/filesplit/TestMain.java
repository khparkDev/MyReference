package com.khpark.util.filesplit;

public class TestMain {

	/**
	 * new TextFileSplit(절대경로포함-파일명)
	 * new TextFileSplit(절대경로포함-파일명, 분할할 파일 개수)
	 * new TextFileSplit(절대경로포함-파일명, 분할할 파일 개수, 버퍼크기)
	 * 
	 * @Author khpark
	 */
	public static void main(String... args) throws Exception {
		String filename = "작업할 파일의 절대경로";
		new TextFileSplit(filename).executeSplitFile();
		//new TextFileSplit(filename, 20).executeSplitFile();
		//new TextFileSplit(filename, 5, 2000).executeSplitFile();
	}
}
