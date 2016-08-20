import java.io.*;
import java.util.HashSet;

public class ArrayStrings
{

// ------------------------------------------------------------------------------------------------
// Problem 1. Find if a string has all unique characters
// ------------------------------------------------------------------------------------------------
    public static boolean isAllUnique(String str)
    {
        HashSet<Character> hsUniqChar = new HashSet<Character>();

        for (char ch : str.toCharArray())
        {
            if (hsUniqChar.contains(ch))
            {
                return false;
            }
            else
            {
                hsUniqChar.add(ch);
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Arrays and Strings");

        // Problem 1. Find if a string has all unique characters
        {
            System.out.println("IsAllUnique: " + isAllUnique("hello"));
            System.out.println("IsAllUnique: " + isAllUnique("helo"));
        }
    }
}
