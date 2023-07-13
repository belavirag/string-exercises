package dev.belavirag.strings;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java".length());
        System.out.println("Long example sentence".charAt(6));
        System.out.println("Even longer example sentence".indexOf('o'));

        {
            final String sentence = "Ok this is not as long!";
            System.out.println(sentence.substring(sentence.indexOf("not"), sentence.length() - 1));
        }

        {
            final String sentence = "CAPS EQUALS SCREAMING";
            final String lowercase = sentence.toLowerCase(Locale.ROOT);
            System.out.println(lowercase);
            final String uppercase = lowercase.toUpperCase(Locale.ROOT);
            System.out.println(uppercase);
        }

        {
            final String sentence = "Java is the worst programming language!";
            System.out.println(sentence.replace("worst", "best"));
        }

        System.out.println("\tJ\ta\tv\ta\t".trim());

        {
            int theInt = 20;
            System.out.println(String.valueOf(theInt) + "20");
        }

        {
            final String[] arr = "Oil and Water".split(" and ");
            System.out.println(Arrays.toString(arr));
        }

        {
            final String[] names = "Carl,Susie,Fredrick,Bob,Erik".split(",");
            for (final String name : names)
            {
                System.out.println(name);
            }
        }

        {
            final char[] chars = "ThisShouldBeConverted".toCharArray();
            for (final char letter : chars)
            {
                System.out.println(letter);
            }
        }

        {
            final char[] chars = {'J','a','v','a'};
            System.out.println(String.valueOf(chars));
        }
    }
}