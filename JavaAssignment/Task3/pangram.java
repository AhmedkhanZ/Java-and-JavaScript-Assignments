import java.util.*;
public class Main
{
    static boolean pangram(String str)
    { 
        int index=0;
        boolean[] bool = new boolean[26];
        Arrays.fill(bool, false);
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                index = str.charAt(i)-'A';
            }
            
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                index = str.charAt(i) - 'a';
            }
            
            bool[index] = true;
        }
        for(int j=0; j<26; j++)
        {
            if(bool[j] == false)
            { return false; }
        }
        return true;
    }
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sentence to check whether it is pangram or not");
        String str = input.nextLine();
        boolean value = pangram(str);
        if(value == true)
        {
        System.out.println("Given Sentence is a Pangram");
        }
        else{
        System.out.println("Given Sentence is not a Pangram");
            
        }
    }
}