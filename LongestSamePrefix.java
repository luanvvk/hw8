package hw8;

import java.util.*;

public class LongestSamePrefix {
	public static String longestSamePrefix(String[] string) {

		if (string.length == 0)
			return "";

		if (string.length == 1)
			return string[0];

		Arrays.sort(string);//O(nlogn)

		int minString = Math.min(string[0].length(), string[string.length - 1].length());

		int i = 0;
		while (i < minString && string[0].charAt(i) == string[string.length - 1].charAt(i))
			i++;
//O(maximum step = min string length)
		String prefix = string[0].substring(0, i);
		return prefix;
	}

	public static void main(String[] args) {
		String[] input = { "flower", "flow", "flight"};
		System.out.println("The longest same prefix is :" + longestSamePrefix(input));
	}
}
//=>> O(nlogn)?