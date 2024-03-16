package McqProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    public class HtmlMcq extends McqSystem {

        public static void question() {
            String csvFile = "D:/New folder/html.csv";
            String line;
            String[] question;
            BufferedReader file = null;
            try {
                try {

                    file = new BufferedReader(new FileReader(csvFile)); // Open the file

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                while (true) {
                    if (!((line = file.readLine()) != null)) break;
                    question = line.split(",");
                    System.out.println(question[0] + "\n" + question[1] + "\n" + question[2] +
                            "\n" + question[3] + "\n" + question[4]);
                    System.out.println("Enter your answer");
                    System.out.println(" ");

                    Scanner Answer = new Scanner(System.in);  //scanner to check user answer and correct answer
                    String answer = Answer.nextLine();
                    if (answer.equals(question[5])) {
                        System.out.println("Your answer is correct");
                        System.out.println(" ");
                        correctAnswer = correctAnswer + 1;
                    } else if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") ||
                            answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) {
                        System.out.println("Sorry.your answer is wrong. The correct answer is " + question[6]);
                        System.out.println(" ");
                        wrongAnswer = wrongAnswer + 1;
                    } else {
                        System.out.println("Please enter valid answer");
                        System.out.println(" ");
                        System.out.println("Enter answer again");
                        Answer = new Scanner(System.in);  //assign user input
                        answer = Answer.next();
                        if (answer.equals(question[5])) {
                            System.out.println("Your answer is correct");
                            System.out.println(" ");
                            correctAnswer = correctAnswer + 1;
                        } else if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") ||
                                answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) {
                            System.out.println("Sorry.your answer is wrong. The correct answer is " + question[6]);
                            System.out.println(" ");
                            wrongAnswer = wrongAnswer + 1;
                        }
                        System.out.println(" ");
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
