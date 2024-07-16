package com.chainsys.problems;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the main string: ");
		String mainString = scanner.nextLine();

		System.out.print("Enter the substring to replace: ");
		String substringToReplace = scanner.nextLine();

		System.out.print("Enter the replacement substring: ");
		String replacementSubstring = scanner.nextLine();

		String modifiedString = replaceSubstring(mainString, substringToReplace, replacementSubstring);

		System.out.println("Modified string: " + modifiedString);

		scanner.close();
	}

	private static String replaceSubstring(String mainString, String substringToReplace, String replacementSubstring) {
		  StringBuilder result = new StringBuilder();
	        int lengthToReplace = substringToReplace.length();
	        int i = 0;

	        while (i < mainString.length()) {
	            if (i <= mainString.length() - lengthToReplace && mainString.substring(i, i + lengthToReplace).equals(substringToReplace)) {
	                result.append(replacementSubstring);
	                i += lengthToReplace;
	            } else {
	                result.append(mainString.charAt(i));
	                i++;
	            }
	        }

	        return result.toString();
	    }
	
	}


