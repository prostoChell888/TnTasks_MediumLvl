package org.example;

public class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram1 = AnagramChecker.check(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + isAnagram1);

        String str3 = "hello";
        String str4 = "world";
        boolean isAnagram2 = AnagramChecker.check(str3, str4);
        System.out.println("Are \"" + str3 + "\" and \"" + str4 + "\" anagrams? " + isAnagram2);

        String str5 = "Debit Card";
        String str6 = "Bad Credit";
        boolean isAnagram3 = AnagramChecker.check(str5, str6);
        System.out.println("Are \"" + str5 + "\" and \"" + str6 + "\" anagrams? " + isAnagram3);
    }
}
