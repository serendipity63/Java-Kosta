package ch9_homework;

public class Ex3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";

		int idx = fullPath.lastIndexOf('\\');

		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + fullPath.substring(0, idx));
		System.out.println("fileName:" + fullPath.substring(idx + 1));
	}

}

//fullPath:c:\jdk1.5\work\PathSeparateTest.java
//path:c:\jdk1.5\work
//fileName:PathSeparateTest.java