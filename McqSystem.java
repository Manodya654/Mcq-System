package McqProject;

import java.util.Scanner;

public class McqSystem {

    private static String question;
    public static int correctAnswer;
    public static int wrongAnswer;
    public static double percentage;
    public static String name;
    public static String course;


    public static double getPercentage() {
        return percentage;
    }

    public static void setPercentage(double percentage) {
        McqSystem.percentage = percentage;
    }


    public static void setName(String name) {
        McqSystem.name = name;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("      WELCOME "); //display welcome
        System.out.println("** Programming Hub ** "); //
        String userName;
        System.out.println("Give your name"); //input username
        userName = sc.nextLine();
        System.out.println("Hello " + userName + "!");

        while (true) {
            Choice();
            printResult();
            repeat();
            break;
        }
    }

    public static void Choice(){
        correctAnswer=0;
        wrongAnswer=0;
        System.out.println("  1.Html ");
        System.out.println("  2.Java ");
        System.out.println("  3.Excel ");
        System.out.println("  4.Database  ");
        System.out.println("Choose your new course");
        System.out.println(" ");
        Scanner Course = new Scanner(System.in); //scanner object to get course
        course = Course.nextLine();
        if (course.equalsIgnoreCase("Html")) {
            System.out.println("Your selected course is " + course); //course html
            System.out.println(" ");
            HtmlMcq.question();

        } else if (course.equalsIgnoreCase("Java")) {
            System.out.println("Your selected course is" + course); //course java
            System.out.println(" ");
            JavaMcq.question();

        } else if (course.equalsIgnoreCase("Excel")) {
            System.out.println("Your selected course is" + course); //course excel
            System.out.println(" ");
            ExcelMcq.question();

        } else if (course.equalsIgnoreCase("Database")) {
            System.out.println("your selected course  is" + course); //course database
            System.out.println(" ");
            DatabaseMcq.question();
        }
        else {
            System.out.println("Type valid Course Name"); //another from courses
        }
    }

    public static void printResult() {
        System.out.println("Correct Answers: " + correctAnswer);
        System.out.println("Wrong Answers: " + wrongAnswer);
        percentage= ((correctAnswer*100)/(correctAnswer+wrongAnswer)); //calculate percentage
        System.out.println("Your final score is:" + percentage);

        System.out.println(" ");
    }

    public static void repeat(){
        System.out.println("Continue with new course (Yes/No)"); //continue or not
        Scanner Like= new Scanner(System.in);
        String like = Like.next();
        if (like.equalsIgnoreCase("yes")) {
            Choice();
            printResult();
            repeat();

        }
        else {
            System.out.println("Thank you!"); //end
        }
    }
}
