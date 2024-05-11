
import java.util.Scanner;
public class Name {
    //Fields
    private String fName;
    private char middleInitial;
    private String lName;

    public Name() {
        getAName();
    }



    public Name(String fName, char middleInital, String lName) {
        setfName(fName);
        setMiddleInitial(middleInitial);
        this.lName = lName;
    }



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        String temp1 = Character.toString(fName.toUpperCase().charAt(0));
        String temp2 = fName.toLowerCase().substring(1);
        fName = temp1 + temp2;
        this.fName = fName;
    }



    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        middleInitial = Character.toUpperCase(middleInitial);
        this.middleInitial = middleInitial;
    }


    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        String temp1 = Character.toString(lName.toUpperCase().charAt(0));
        String temp2 = lName.toLowerCase().substring(1);
        lName = temp1 + temp2;
        this.lName = lName;
    }



    public String toString() {
        String result = "";
        if(middleInitial != ' ')
            result = fName + " " + middleInitial + ". " + lName;
        else
            result = fName + " " + lName;
        return result;
    }

    public void getAName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first name: ");
        fName = input.nextLine();

        System.out.print("Please enter the middle Initial or a space if you don't have one: ");
        String temp = input.nextLine();
        if (temp == " ")
            middleInitial = ' ';
        else
            middleInitial =temp.charAt(0);

        System.out.print("Please enter the last name: ");
        lName = input.nextLine();


        setfName(fName);
        setMiddleInitial(middleInitial);
        setlName(lName);
    }


}//end Class Name