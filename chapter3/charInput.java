import java.io.IOException;

public class charInput{
    public static void main(String args[]) throws IOException{
        System.out.println("Please enter a character");
        char ch=(char) System.in.read();

        System.out.println("your character is "+ch);
    }
}