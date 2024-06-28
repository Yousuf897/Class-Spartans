package week_13.lab_session.interfacepractice;  // Defines the package where this class belongs

// Abstract class declaration named GeneralInformation
public abstract class GeneralInformation {

    // Fields (Instance variables)
    public String firstName;      // Stores the first name of a person
    public String lastName;       // Stores the last name of a person
    public String dateOfBirth;    // Stores the date of birth of a person
    public String occupation;     // Stores the occupation of a person

    // Constructor
    public GeneralInformation(String firstName, String lastName, String dateOfBirth, String occupation) {
        this.firstName = firstName;     // Assigns the provided first name to the instance variable
        this.lastName = lastName;       // Assigns the provided last name to the instance variable
        this.dateOfBirth = dateOfBirth; // Assigns the provided date of birth to the instance variable
        this.occupation = occupation;   // Assigns the provided occupation to the instance variable
    }

    // Getters (Accessor methods)
    public String getFirstName() {
        return firstName;   // Returns the stored first name of the person
    }

    public String getLastName() {
        return lastName;    // Returns the stored last name of the person
    }

    public String getDateOfBirth() {
        return dateOfBirth; // Returns the stored date of birth of the person
    }

    public String getOccupation() {
        return occupation;  // Returns the stored occupation of the person
    }
}
