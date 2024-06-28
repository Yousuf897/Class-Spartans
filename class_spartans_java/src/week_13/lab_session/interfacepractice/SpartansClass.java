package week_13.lab_session.interfacepractice;  // Defines the package where this interface belongs

// Interface declaration named SpartansClass
public interface SpartansClass {

    // Fields, Variables
    String className = "Spartans";  // Defines a constant string for class name
    String teacherName = "Yousuf";  // Defines a constant string for teacher's name
    String startTime = "7.00PM";    // Defines a constant string for start time of sessions
    String endTime = "10.00PM";     // Defines a constant string for end time of sessions
    int numberOfJavaSession = 15;   // Defines a constant integer for the number of Java sessions
    String javaSchedule = "13 weeks";  // Defines a constant string for the duration of the Java schedule

    // Methods
    void printInfo();  // Declares a method without implementation, to be defined by classes implementing this interface

}
