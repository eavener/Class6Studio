import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Question [] questions = {
                new MultipleChoice("What color is the sky?", "1 - red", "2 - orange", "3 - green", "4 - blue", 4),
                new Checkbox("What color(s) can dogs be?", "1 - tan", "2 - white", "3 - black", "4 - purple", 123),
                new TrueFalse("A woodchuck would chuck as much wood as a woodchuck could chuck if a woodchuck could chuck wood.", "1 - true", "2 - false", 1)
        };
        takeTest(questions);
    }

        public static void takeTest(Question[] questions) {
            int score = 0;
            Scanner scan = new Scanner(System.in);

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i].askQuestion());
                Integer choice = scan.nextInt();
                if (choice.equals(questions[i].answerActual)) {
                    score++;
                }
            }
            System.out.println("You got " + score + "/" + questions.length);
        }

}
