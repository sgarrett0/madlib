import java.util.Scanner;

public class MadLib{
    public static void main(String[] args){
        //Getting the code ready to listen for keyboard input.
        Scanner keyboardInput = new Scanner(System.in);
        String finalTemplate = "";
        
        /**
         * I want to change "I" in the sentence below.
         * I can use substring to get a new string and replace word by word.
         *  */  
        String sentence0 = "I knows, but I never got to say what I needed to say to you.";
        /**
         * Sentence after I:
         * Make sure you include the whitespace in the substring
         *  */ 
        String firstReplacement = sentence0.substring(1, sentence0.length()-1);
        
        //print statement to ask user for specific input
        System.out.print("Please enter a singular noun:");
        
        //Asking/Storing keyboard input
        String myInput = keyboardInput.nextLine();
       
        /**
         * Concatenating my keyboard input and the rest of my sentence +
         * Concatenating it all into my finalTemplate Variable that I will output
         * at the end to show my altered quote
         */
        finalTemplate += myInput + firstReplacement;

        //Outputting my altered quote
        System.out.print(finalTemplate);
        keyboardInput.close();
    }

}