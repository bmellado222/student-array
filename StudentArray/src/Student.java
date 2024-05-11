import java.util.Scanner;

public class Student {
    //fields
    Date date;
    Name name;
    float gpa;
    int creditHours;


    //constructors
    public Student() {
        createStudent();
    }


    public Student(Date date, Name name, float gpa, int creditHours) {
        super();
        this.date = date;
        this.name = name;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }//end constructors

    // setters and getters
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }


    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }



    public String toString() {
        String result = date.toString() + "\n";
        result       += name.toString() + "\n";
        result       += gpa             + "\n";
        result       += creditHours     + "\n";
        return result;

    }//end to string



    public void createStudent() {
        Scanner inputStudent = new Scanner(System.in);
        date = new Date();
        name = new Name();
        System.out.println("enter your gpa: ");
        gpa = inputStudent.nextFloat();
        System.out.println("please enter your credit hours: ");
        creditHours = inputStudent.nextInt();


    }//end createStudent





}//end class Student