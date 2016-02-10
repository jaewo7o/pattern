package com.jaewoo.test.regex;

public class RegularExpressTest1 {
	public static void main(String[] args) {
		//String str = "1    개월";
		String str = "27 2";

		String[] arStrNormalSpace = str.split(" ");
		System.out.println("단순 공백 자르기");
		for (int i = 0; i < arStrNormalSpace.length; i++) {
			System.out.println("[" + i + "] = ^" + arStrNormalSpace[i] + "^");
		}

		System.out.println("정규식으로 공백 한칸 자르기");
		String[] arStrRegexSingleSpace = str.split("\\s");
		for (int i = 0; i < arStrRegexSingleSpace.length; i++) {
			System.out.println("[" + i + "] = ^" + arStrRegexSingleSpace[i]
					+ "^");
		}

		System.out.println("정규식으로 1칸이상의 공백 자르기");
		String[] arStrRegexMultiSpace = str.split("\\s+");
		for (int i = 0; i < arStrRegexMultiSpace.length; i++) {
			System.out.println("[" + i + "] = ^" + arStrRegexMultiSpace[i]
					+ "^");
		}
	}
}
