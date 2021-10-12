public class Checkbox extends MultipleChoice {
    public Checkbox(String prompt, String answerOne, String answerTwo, String answerThree, String answerFour, Integer answerActual) {
        super(prompt, answerOne, answerTwo, answerThree, answerFour, answerActual);
    }

    @Override
    public String askQuestion() {
        return this.prompt + " Enter all numbers that apply:\n" + this.answerOne + "\n" + this.answerTwo + "\n" + this.answerThree + "\n" + this.answerFour;
    }
}
