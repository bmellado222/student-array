/*****************************************************************************
 * Name(s): Bryan Mellado, Bao Nguyen, Jose Ramos, Miguel Urrego Grajales	 *
 * Course: 	COP-2800C	     												 *
 * Purpose:	Exam Two(Students Module)										 *
 * Date: 	10/24/2023														 *
 *****************************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClassStudent {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int size = 0;
        boolean goodSize = true;

        do {
            try {
                System.out.println("How many Students would you like to record? ");
                size = input.nextInt();
                goodSize = true;
            }catch(InputMismatchException e) {
                System.out.println("You must enter a valid integer value!");
                goodSize = false;
                input.nextLine();
            }
        }while(!goodSize);

        Student[] myStudents = new Student[size];

        for (int i = 0; i < size; i++) {
            myStudents[i] = new Student();
        }

        for (int i = 0; i < myStudents.length ; i++) {
            System.out.println("Student " + (i + 1) + ":\n" + myStudents[i]);
        }

    }//end method main

    public static Scanner getScanner() {
        return input;
    }//end getScanner;


}//end class TestClassStudent