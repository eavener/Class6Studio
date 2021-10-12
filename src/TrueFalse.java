public class TrueFalse extends Question {
    private String answerOne;
    private String answerTwo;

    public TrueFalse (String prompt, String answerOne, String AnswerTwo, Integer answerActual) {
        super(prompt, answerActual);
        this.answerOne = "1 - true";
        this.answerTwo = "2 - false";
    }

    @Override
    public String askQuestion() {
        return this.prompt + " Enter one number:\n" + this.answerOne + "\n" + this.answerTwo;
    }
}
