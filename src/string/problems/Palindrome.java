package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String: ");

        String str= sc.next();

        String reverse="";
        int len= str.length();

        for (int i=len-1; i>=0; i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if (str.equals(reverse))
        {
            System.out.println(str +" is a Palindrome String");
        }
        else
        {
            System.out.println(str +" is not a Palindrome String");
        }
    }
}
