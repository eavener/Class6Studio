public abstract class Question {
    String prompt;
    Integer answerActual;

    public Question(String prompt, Integer answerActual) {
        this.prompt = prompt;
        this.answerActual = answerActual;
    }

    public String askQuestion() {
        return this.prompt;
    }
}