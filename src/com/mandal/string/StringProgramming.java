package com.mandal.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class StringProgramming {
	//https://medium.com/javarevisited/top-21-string-programming-interview-questions-for-beginners-and-experienced-developers-56037048de45
	private final static String str = "This string is for test programming abba or madam 1234321";
	private final static String numStr = "1234321";
	public static void main(String[] args) {
		StringProgramming programming = new StringProgramming();
		programming.reverseString(str);
		programming.duplicateCharInString(str);
		programming.anagrams();
		programming.permutations(str);
		System.out.println("recursively reverse string : "+programming.reverseUsingRecursion(str));
		programming.isStringContainsOnlyDigits(str);
		programming.findDuplicateCharacters(str);
		programming.countVowels(str);
		programming.occurrenceOfAChar(str, 'a');
		programming.firstNonrepeatedCharacter(str);
		programming.findWordInString(str, "string");
	}


	//How do you reverse a given string in place? 
	public void reverseString(String str) {
		System.out.println(str);
		//Way 1
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());

		//Way 2
		char[] ch = str.toCharArray();
		String s="";
		for (int i = str.length()-1; i>=0; i--) {
			s = s+ch[i];
		}
		System.out.println(s);
	}
	
	//How can a given string be reversed using recursion?
	public String reverseUsingRecursion(String s) {
		if(s.length() <= 1)
			return s;
		
		return reverseUsingRecursion(s.substring(1)) + s.charAt(0);
		
	}


	//How do you print duplicate characters from a string?
	public void duplicateCharInString(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for(char c: ch) {
			if(c == ' ') {
				c = '1';
			}
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		//map.entrySet().forEach(System.out::println);
		map.entrySet().stream().filter(entry -> entry.getValue() >1).forEach(System.out::println);
	}


	//How do you check if two strings are anagrams of each other?
	public void anagrams() {
		String s1 = "I am subrata mandal";
		String s2 = "am mandal I subrata";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		char[] ch3 = s1.toCharArray();
		char[] ch4 = s2.toCharArray();
		//way 1


		Arrays.sort(ch3);
		Arrays.sort(ch4);

		if (Arrays.equals(ch3, ch4)) {
			System.out.println("both are anagram");
		}else {
			System.out.println("both are not anagram");
		}


		if(s1.length() != s2.length()) {
			System.out.println("Not anagram");
			return;
		}

		//way 2
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);


		Map<Character,Boolean> map = new HashMap<Character, Boolean>();

		for (char c: ch1) {
			map.put(c, true);
		}

		for(char c: ch2) {
			if (!map.containsKey(c)) {
				System.out.println("Not anagram" + c);
			} else {
				System.out.println("anagram");
				return;
			}
		}

	}


	//How do you find all the permutations of a string?
	public void permutations(String str) {
		str = "1234";
		System.out.println("permutations");
		int len = str.length();
		int n = fact(len);

		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder(str);
			int tempIndex = i;

			for(int div=len; div>0; div--) {
				int q = tempIndex / div;
				int r = tempIndex % div;

				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);

				tempIndex = q;
			}
			System.out.println();
		}
	}

	private int fact(int i) {
		if(i == 1)
			return 1;
		return i * fact(i -1);
	}

	//How do you check if a string contains only digits?
	public void  isStringContainsOnlyDigits(String str) {
		
		//Way 1
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		boolean flag = false;
		
		for(int i =0; i< ch.length; i++) {
			 if(!Character.isDigit(ch[i])) {
				 flag = true;
				 break;
			 }
		}
		 if(!flag) {
			 System.out.println("This is not contains only integer");
		 }else {
			 System.out.println("Yes, this is contains only integer");
		 }
		
		 
		 //Way 2
		 Pattern pattern = Pattern.compile(".*[^0-9].*");
		 System.out.println("The string contains only degits: "+pattern.matcher(str).matches());
	}


	//How do you find duplicate characters in a given string?
	public void findDuplicateCharacters(String str) {
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c: ch) {
			set.add(c);
		}
		
		set.stream().forEach(System.out::println);
	}


	//How do you count a number of vowels and consonants in a given string?
	public void countVowels(String str) {
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			switch(ch[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if (map.containsKey(ch[i])) {
					map.put(ch[i], map.get(ch[i]) + 1);
				}else {
					map.put(ch[i], 1);
				}
				break;
			}
		}
		map.entrySet().stream().forEach(System.out::println);
	}


	//How do you count the occurrence of a given character in a string?
	public void occurrenceOfAChar(String str, char c) {
		char[] ch = str.toCharArray();
		int count = 0;
		//Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(char cc: ch) {
			if(cc == c) {
				count++;
			}
		}
		
		System.out.println("Count of given cahr "+c+" is: "+count);
	}

	public void findWordInString(String str, String word) {
		System.out.println(str);
		System.out.println("findWordInString");
		char[] ch = str.toCharArray();
		char[] w = word.toCharArray();
		for(int i=0; i< str.length(); i++) {
			int temp =i;
			int countLen = 0;
			boolean flag = false;
			for(int j=0;j<w.length;j++) {
				System.out.println("i="+i+" j= "+j+" w= "+w[j]+" c= "+ch[i]);
				if(w[j] == ch[i]) {
					System.out.println(">>>matched");
					i++;
					countLen ++;
					if(countLen==w.length) {
						flag = true;
						break;
					}
				}else {
					i=temp;
				}
			}
			if(flag) {
				System.out.println(str);
				System.out.println(word +" found at position "+(i - w.length));
				break;
			}
		}

	}
	
	public void findAllSubset(String str) {
		int len = str.length();
		
		
	}

	
	public void findWordInString2(String str, String word) {
		System.out.println(str);
		System.out.println("findWordInString");
		char[] ch = str.toCharArray();
		char[] w = word.toCharArray();
		int pos = 0;
		for(int i=0; i< word.length(); i++) {
			int temp =i;
			int countLen = 0;
			
			boolean flag = false;
			for(int j=0;j<ch.length;j++) {
				int t = j;
				System.out.println("i="+i+" j= "+j+" w= "+w[i]+" c= "+ch[j]);
				if(w[i] == ch[j]) {
					i++;
					System.out.println(">>>matched");
					countLen ++;
					if(countLen==w.length) {
						flag = true;
						pos = j ;
						break;
					}
				}else {
					i = temp;
				}
			}
			
			if(flag) {
				System.out.println(str);
				System.out.println(word +" found at position "+(pos - word.length()));
				break;
			}
		}

	}

	//How do you print the first non-repeated character from a string?
	public void firstNonrepeatedCharacter(String str){
		str = str.replaceAll("\\s", "");
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c: ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First non repeated char is= "+entry.getKey());
				break;
			}
		}
	}


	//How do you convert a given String into int like the atoi()?
	public void convertAtoi(String str) {
		char[] ch = str.toCharArray();
		int len = ch.length;
		int n =0;
		for(int i=0;i<len;i++) {
			n = Integer.parseInt(""+ch[i]);
			n=n*(n+1)/2;
		}
		System.out.println("Converted int value is= "+n);
	}


	//How do you reverse words in a given sentence without using any library method? (solution)
	public void reverseWords() {}


	//How do you check if two strings are a rotation of each other? (solution)
	public void checkrotation() {}


	//How do you check if a given string is a palindrome? (solution)
	public void palindrome() {}


	//How do you find the length of the longest substring without repeating characters? (solution)
	public void longestSubstringWithoutRepeatingChar() {}


	//Given string str, How do you find the longest palindromic substring in str? (solution)
	public void longestPalindrom() {}


	//How to convert a byte array to String? (solution)
	public void convertByteArrToString() {}


	//how to remove the duplicate character from String? (solution)
	public void removeDuplicate() {}


	//How to find the maximum occurring character in given String? (solution)
	public void maxOccurringChar() {}


	//How do you remove a given character from String? (solution)
	public void removeAChar() {}


	//Given an array of strings,
	//find the most frequent word in a given array, 
	//I mean, the string that appears the most in the array. In the case of a tie, 
	//​the string that is the smallest (lexicographically) ​is printed. (solution)
	public void find() {}
}
