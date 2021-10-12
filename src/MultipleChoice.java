public class MultipleChoice extends Question {
    String answerOne;
    String answerTwo;
    String answerThree;
    String answerFour;

    public MultipleChoice (String prompt, String answerOne, String answerTwo, String answerThree, String answerFour, Integer answerActual) {
        super(prompt, answerActual);
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
    }

    @Override
    public String askQuestion() {
        return this.prompt + " Enter one number:\n" + this.answerOne + "\n" + this.answerTwo + "\n" + this.answerThree + "\n" + this.answerFour;
    }


}
