package com.company;

import java.util.Locale;

public class cwh_15_ps3 {
    public static void main(String[] args) {
        //Problem 1
        String name ="KHUSHWANT";
      name=name.toLowerCase(); //use for convert in lower case
       // System.out.println(name.toLowerCase()); use for print in lower case
        System.out.println(name);
        // Problem 2
        //String text = "To My     Friend";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Khushwant,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}

