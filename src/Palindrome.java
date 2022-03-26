import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Palindrome  {
    public static void main(String[] args) throws IOException {
        System.out.println("This program checks if a word is a palindrome");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please Enter your word");
        String word = br.readLine();
        word=word.toLowerCase();
        if ((word.charAt(0)==word.charAt(word.length()-1))&&(word.charAt(1)==word.charAt(word.length()-2))){
            System.out.println("it is a palindrome");
            System.out.println(word);
        }
        else {
            System.out.println("it is not a palindrome");
        }


    }
}
