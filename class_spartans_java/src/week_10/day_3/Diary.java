package week_10.day_3;

public class Diary {

    private String thoughts;
    private String experiences;

    // Constructor
    public Diary( String thoughts, String experiences ) {
        setThoughts(thoughts);
        setExperiences(experiences);
    }

    // Getters
    private String getThoughts() {return thoughts;}
    private String getExperiences() {return experiences;}

    // Setters
    private void setThoughts(String thoughts) {this.thoughts = thoughts;}
    private void setExperiences(String experiences) {this.experiences = experiences;}

    // Public Methods
    public void print() {
        System.out.println("Thoughts: " + getThoughts());
        System.out.println("Experiences: " + getExperiences());
    }

}