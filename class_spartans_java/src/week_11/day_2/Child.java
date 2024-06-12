package week_11.day_2;
import java.util.ArrayList;
import java.util.List;

public class Child extends Father {

    private String childName;
    private final List<String> childNames;

    // Constructor
    public Child(String grandFatherName, String fatherName, String childName ) {
        super(grandFatherName, fatherName);
        setChildName(childName);
        childNames = new ArrayList<>();
        addNameToList(childName);
    }

    // Print Child Info
    public void printChildInfo() {
        System.out.println("GrandFather: " + getGrandFatherName());
        System.out.println("FatherName: " + getFatherName());
        System.out.println("ChildName: " + getChildName());
    }

    public String getChildName() {return childName;}
    private void setChildName(String childName) {this.childName = childName;}

    public void updateChildName(String childName ) {
        setChildName(childName);
        addNameToList(childName);
    }

    public void printChildNameUpdates() {
        System.out.println( childNames );
    }

    private void addNameToList( String childName ) {
        childNames.add(childName);
    }

}
