import java.io.IOException;

public class GuessGame{
    public static void main(String args[]) throws IOException{
        char ch,answer='K';
        System.out.println("Please enter a Character between A and Z");
        ch=(char)System.in.read();
        if(ch==answer){
            System.out.println("You Guessed it");
        }
        else
        {
            System.out.println("Sorry wrong guess");
        }
        
    }
}