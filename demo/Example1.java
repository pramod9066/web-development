package com.demo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Example1 {
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		/*
		 * Scanner scan = new Scanner(System.in); int i = scan.nextInt();
		 * 
		 * // Write your code here. double d = scan.nextDouble(); String s1 =
		 * scan.nextLine(); System.out.println("String: " + s1);
		 * System.out.println("Double: " + d); System.out.println("Int: " + i); Integer
		 * n = i; String string = Integer.toString(i);
		 * System.out.println(string.getClass());
		 * 
		 * LocalDate dt = LocalDate.of(2015, 8, 05);
		 * System.out.println(dt.getDayOfWeek().name());
		 */

		MessageDigest salt = MessageDigest.getInstance("SHA-256");
		salt.update(UUID.randomUUID().toString().getBytes("UTF-8"));
		String digest = bytesToHex(salt.digest());
		System.out.println(digest);

	}

	public static String bytesToHex(byte[] bytes) {
		final char[] hexArray = "0123456789ABCDEF".toCharArray();
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
}
