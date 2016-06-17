import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Lovely Palindromes
 *
 * Template class for solution.
 *
 * Creation date: 5/27/2016. Author: Stephen
 *
 * Copyright 2016, The League of Amazing Programmers
 */
public class LovelyPalindromes {

	public static boolean isPalindrome(String testString) {
		return testString != null && testString.equals(new StringBuilder(testString).reverse().toString());
	}

	public static void main(String[] args) {
		String urlString = "https://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt";

		// 1. Create a URL from the urlString
		URL url = null;
		try {
			url = new URL(urlString);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
		// 2. Open the URL and read each line from the file, create a list of
		// words
		String line1;
		ArrayList<String> aL = new ArrayList<String>();
		try (BufferedReader bR = new BufferedReader(new InputStreamReader(url.openStream()))) {
			while ((line1 = bR.readLine()) != null) {
				aL.add(line1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. Test each word and see if it is a palindrome (There are 161)
		int x = 0;
		for (String s : aL) {
			if (isPalindrome(s)) {
				x++;
			}
		}
		System.out.println(x);
		// 4. Optionally, find each semordnilap (There are 1091)
		int y = 0;
		HashSet<String> hS = new HashSet<String>(aL);
		for (String sT : aL) {
			if (!isPalindrome(sT) && hS.contains(new StringBuilder(sT).reverse().toString())) {
				y++;
			}
		}
		System.out.println(y);
	}
}
