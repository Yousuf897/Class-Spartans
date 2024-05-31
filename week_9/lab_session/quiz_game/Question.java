package week_9.lab_session.quiz_game;

public class Question {

    // Variables
    private String questionText;
    private String[] choices;
    private int correctAnswer;

    // Constructor
    public Question(String questionText, String[] choices, int correctAnswer) {
        setQuestionText(questionText);
        setChoices(choices);
        setCorrectAnswer(correctAnswer);
    }

    // Private Methods || Setters
    private void setQuestionText(String questionText) {this.questionText = questionText;}
    private void setChoices(String[] choices) {this.choices = choices;}
    private void setCorrectAnswer(int correctAnswer) {this.correctAnswer = correctAnswer;}

    // Public Methods || Getters
    public String getQuestionText() {return questionText;}
    public String[] getChoices() {return choices;}
    public int getCorrectAnswer() {return correctAnswer;}
    public boolean isCorrect( int userAnswer ) {return userAnswer == getCorrectAnswer();}
}
