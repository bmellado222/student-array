import java.util.InputMismatchException;
import java.util.Scanner;

public class Date {
    //Fields, the order of these variables are mostly deliberate, day must be last
    private int year;
    private int month;
    private int day;

    //Constructors
    public Date() {
        createDOB();
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }//end of Constructors

    //Setters & Getters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        //Formatted to look good if the number happens to be in the single digits, fills empty space with 0
        return String.format("Date of Birth: " + "%04d/%02d/%02d", year, month, day);
    }//end of toString

    private int daysInMonth(int year, int month) {
        //I put the first value in this array as 0 because I want to make it easy to just have someone input 1-12 and then have it accurately match the value in the array
        //probably a better way but this is far easier
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        /* The year number must be divisible by four – except for end-of-century years, which must be divisible by 400
         * Leap Years only matters during Feburary because that's the month that is effected by a leap year, GO FIGURE! */
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month == 2) {
            return 29;
        }
        return daysInMonth[month];
    }

    public void createDOB() {
        Scanner input = TestClassStudent.getScanner();
        int year = 0;
        int month = 0;
        int day = 0;
        boolean goodInt = true;
        do {
            try {
                System.out.print("Enter the Student's year of birth (e.g., 2023): ");
                year = input.nextInt();
                goodInt = true;
            }catch(InputMismatchException e) {
                System.out.println("You must enter a valid integer value for the year!");
                goodInt = false;
                input.nextLine();
            }
        }while(year < 1 || !goodInt);

        do {
            try {
                System.out.print("Enter the Student's month of birth (1-12): ");
                month = input.nextInt();
                goodInt = true;
            }catch(InputMismatchException e) {
                System.out.println("You must enter a valid integer value for the month!");
                goodInt = false;
                input.nextLine();
            }
        } while (month < 1 || month > 12 || !goodInt);

        do {
            try {
                System.out.print("Enter the Student's day of birth (1-" + daysInMonth(year, month) + "): ");
                day = input.nextInt();
                goodInt = true;
            }catch(InputMismatchException e) {
                System.out.println("You must enter a valid integer value for the day!");
                goodInt = false;
                input.nextLine();
            }
        } while (day < 1 || day > daysInMonth(year, month) || !goodInt);

        setYear(year);
        setMonth(month);
        setDay(day);
    }//end method CreateDOB

}//end class Date
