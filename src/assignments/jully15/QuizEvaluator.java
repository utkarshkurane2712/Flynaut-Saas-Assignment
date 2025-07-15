package assignments.jully15;

import java.util.Scanner;

public class QuizEvaluator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. What is the capital of India?\nA. Mumbai\nB. Delhi\nC. Chennai\nD. Kolkata",
                "2. What is the national animal of India?\nA. Tiger\nB. Lion\nC. Elephant\nD. Cow",
                "3. Which festival is known as the Festival of Lights?\nA. Holi\nB. Eid\nC. Diwali\nD. Pongal",
                "4. What is the national sport of India?\nA. Cricket\nB. Hockey\nC. Football\nD. Badminton",
                "5. Who is known as the Father of the Nation?\nA. Jawaharlal Nehru\nB. Mahatma Gandhi\nC. Sardar Patel\nD. Subhash Chandra Bose"
        };

        String[] correctAnswers = {"B", "A", "C", "B", "B"};
        String[] userAnswers = new String[5];

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(questions[i]);
                System.out.print("Your answer (A/B/C/D): ");
                userAnswers[i] = scanner.nextLine().trim().toUpperCase();

                if (userAnswers[i].isEmpty()) {
                    throw new QuizExceptions.IncompleteAnswerException("Answer for question " + (i + 1) + " cannot be left blank.");
                }
            }

            int score = 0;
            for (int i = 0; i < 5; i++) {
                if (userAnswers[i].equals(correctAnswers[i])) {
                    score++;
                }
            }

            System.out.println("\nYou scored: " + score + " out of 5");
        } catch (QuizExceptions.IncompleteAnswerException e) {
            System.out.println("\nException: " + e.getMessage());
        } finally {
            System.out.println("Quiz evaluation complete.");
        }

        scanner.close();
    }
}
