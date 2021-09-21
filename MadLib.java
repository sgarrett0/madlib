import java.util.Scanner;

public class MadLib{
    public static void main(String[] args){
        //Getting the code ready to listen for keyboard input.
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("please enter hello: ");
        //Asking for keyboard input
        String sayingHi = keyboardInput.nextLine();
        System.out.print("Please enter your name: ");
        String secondSentence = keyboardInput.nextLine();
        System.out.print(sayingHi + " " + secondSentence);
        keyboardInput.close();
    }

}