package week_1;

import static input.InputUtils.*;

/**
 * Ask the user how many miles they live from MCTC.

 Once the user has typed in their response,

 •	Display "You live more than 10 miles from MCTC" if they live more than 10 miles away,
 •	Display "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
 •	Display "You live less than 10 miles from MCTC" if they live less than 10 miles away.

 Use if – else if – else statements.

 */
public class Question_1_Miles_From_MCTC {

    public static void main(String[] args) {

        double miles = doubleInput("How many miles do you live from MCTC? ");

        String response = milesFromMCTC(miles);

        System.out.println(response);

    }


    public static String milesFromMCTC(double miles) {

        // TODO Use if - else if - else statements to return the correct String

        // Return  "You live more than 10 miles from MCTC" if they live more than 10 miles away,
        // Return  "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
        // Return  "You live less than 10 miles from MCTC" if they live less than 10 miles away.

        if (miles > 10) {
            return "You live more than 10 miles from MCTC";// used an if statement to check if answer is more thsn 10miles
        } else if (miles == 10) {// this si to check whether the answer is exactly 10 miles
            return "You live exactly 10 miles from MCTC";// this are our strings that we return to the user based on their answers
        } else {
            return "You live less than 10 miles from MCTC";

        }

    }

}

