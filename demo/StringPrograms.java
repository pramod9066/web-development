package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class StringPrograms {

	public static void main(String[] args) {
		// reverse("This String will be getting reversed");
		// duplicateChar("javabb");
		// printDuplicateCharacters("java");
		// System.out.println(isAnagram("mary", "army"));
		// printPermutn("ABC", "");
		// System.out.println(reverseRecursively("pramod"));
		// vowelAndConsonantsCounter("How many vowels in this String");
		// countCharInString("How do you count the occurrence of a given character in a
		// string", 'e');
		// System.out.println(firstNonRepeatChar("bbddnnic"));
		// isPalindrome("madam");
		// allCharCount("AaAWRFFSbabb#$%###");
		// reverseWords("hi bye");
		// reverseWordInMyString("hi bye");
		// reverseOrderTheString("hi bye");
		// wordReverseInSentence("hi bye");
		// leftRotate("pramod", 3);
		rightRotate("pramod", 2);
	}

	// to reverse a string
	public static String reverse(String s) {
		String ss = new String();
		if (s == null || s.isEmpty()) {
			return s;
		}
		char[] cs = s.toCharArray();
		for (int i = cs.length - 1; i >= 0; i--) {
			System.out.print(cs[i]);
		}
		return ss.toString();
	}

	// to reverse a string using recursion
	public static String reverseRecursively(String str) {
		System.out.println(str);
		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}

		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

	// to find repeated char in string
	public static void duplicateChar(String str) {
		char[] array = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (array[i] == array[j]) {
					System.out.print(array[j] + " ");
					break;
				}
			}
		}
	}

	// to find repeated char in string (2)
	public static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();

		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}

	// to find if given string is anagram or not
	public static boolean isAnagram(String str, String word) {

		if (word == null || word.isEmpty() || str.length() != word.length()) {
			return false;
		}
		char[] charArray = str.toCharArray();
		/*
		 * Arrays.parallelSort(charArray); Arrays.parallelSort(charArray2); boolean
		 * return Arrays.equals(charArray, charArray2);
		 */
		for (char c : charArray) {
			int indexOf = word.indexOf(c);
			if (indexOf != -1) {
				word = word.substring(0, indexOf) + word.substring(indexOf + 1, word.length());
				System.out.println(word);
			} else {
				return false;
			}

		}
		return word.length() == 0 ? true : false;
	}

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {
		System.out.println("str : " + str + " ans : " + ans);
		// If string is empty
		if (str.length() == 0) {
			System.out.println("term : " + ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			// ith character of str
			char ch = str.charAt(i);
			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);
			// Recurvise call
			printPermutn(ros, ans + ch);
		}
	}

	// count vowels and consonants in a string
	public static void vowelAndConsonantsCounter(String str) {
		int c = 0, v = 0;
		char[] charArray = str.toCharArray();
		for (char d : charArray) {
			switch (d) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				v++;
			case ' ':
				break;
			default:
				c++;
			}
		}
		System.out.println("vowels = " + v + " consonants = " + c);
	}

	// to count a char in the given string
	public static void countCharInString(String str, char c) {
		int cnt = 0;
		if (str.isEmpty() || str == null) {
			System.out.println("the string is null or empty");
		}
		char[] charArray = str.toCharArray();
		for (char d : charArray) {
			if (d == c)
				cnt++;
		}
		System.out.println("the count of character : " + c + " in string --> " + str + " is = " + cnt);

	}

	// to find the first non-repeated char
	public static Character firstNonRepeatChar(String s) {
		int[] found = new int[256];
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			found[chars[i]]++;
		}
		for (int i = 0; i < chars.length; i++) {
			if (found[chars[i]] == 1)
				return chars[i];
		}
		return null;
	}

	// to check for palindrome
	public static void isPalindrome(String str) {
		String reversed = reverseRecursively(str);
		if (str.equals(reversed)) {
			System.out.println("is palindrome");
		} else
			System.out.println("not a palindrome");
	}

	// to find all the occurances of a char in the string
	public static void allCharCount(String s) {

		int[] found = new int[256];

		for (int i = 0; i < s.length(); i++) {
			found[s.charAt(i)]++;
		}

		char[] str = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			str[i] = s.charAt(i);
			int flag = 0;

			for (int j = 0; j <= i; j++) {

				if (s.charAt(i) == str[j])
					flag++;
			}
			if (flag == 1)
				System.out.println("Occurrence of char " + s.charAt(i) + " in the String is : " + found[s.charAt(i)]);

		}

	}

	// to reverse a words in string
	public static void reverseWords(String str) {

		Stack<Character> st = new Stack<Character>();

		// Traverse given string and push all
		// characters to stack until we see a space.
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) != ' ')
				st.push(str.charAt(i));

			// When we see a space, we print
			// contents of stack.
			else {
				while (st.empty() == false) {
					System.out.print(st.pop());

				}
				System.out.print(" ");
			}
		}

		// Since there may not be space after
		// last word.
		while (st.empty() == false) {
			System.out.print(st.pop());

		}
	}

	// to reverse a words in string(2)
	public static void reverseWordInMyString(String str) {
		/*
		 * The split() method of String class splits a string in several strings based
		 * on the delimiter passed as an argument to it
		 */
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				/*
				 * The charAt() function returns the character at the given position in a string
				 */
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

	// to print sentence in reverse order
	public static void reverseOrderTheString(String str) {
		String s = "";
		String[] word = str.split(" ");
		for (int i = word.length - 1; i >= 0; i--) {
			s += word[i] + " ";
		}
		System.out.println(s);
	}

	// to print sentence in reverse order(2)
	public static String wordReverseInSentence(String str) {
		int i = str.length() - 1;
		int start, end = i + 1;
		String result = "";

		while (i >= 0) {
			if (str.charAt(i) == ' ') {
				start = i + 1;
				while (start != end) {
					result += str.charAt(start++);
				}
				result += ' ';
				end = i;
			}
			i--;
		}

		start = 0;
		System.out.println(end);
		while (start != end)
			result += str.charAt(start++);
		System.out.println(result);
		return result;
	}

	// to left rotate a string
	public static void leftRotate(String str, int d) {
		if (d == 0 || d >= str.length()) {
			System.out.println(str);
		} else if (str.isEmpty() || str.equals(null)) {
			System.out.println("string is null");
		}
		str = str.substring(d) + str.substring(0, d);
		System.out.println(str);
	}

	// to right rotate a string
	public static void rightRotate(String str, int d) {
		if (d == 0 || d >= str.length()) {
			System.out.println(str);
		} else if (str.isEmpty() || str.equals(null)) {
			System.out.println("string is null");
		}
		str = str.substring(str.length() - d) + str.substring(0, str.length() - d);
		System.out.println(str);
	}
}
