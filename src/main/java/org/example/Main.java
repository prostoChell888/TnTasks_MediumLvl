package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "leetcode";
        char firstUniqueChar = FirstUniqueCharacter.find(str);
        System.out.println("The first unique character in \"" + str + "\" is: " + firstUniqueChar);
    }
}
