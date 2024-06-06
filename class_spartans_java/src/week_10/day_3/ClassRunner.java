package week_10.day_3;

public class ClassRunner {

    public static void main(String[] args) {

        
        var tekSchoolStudentObj = new TekSchoolStudent(
                505, "John",
                "Doe",
                95,
                "mm/yy/yyyy",
                "Java Veteran",
                "Cry in Java",
                "Master Certificate" );

        // College Students
        var collegeStudentObj = new CollegeStudent(
                101,
                "Alexander",
                "Morphy",
                45,
                "10/09/1976",
                "Veteran",
                3.7,
                "Bachelors in Computer Science",
                new String[]{"Java", "SQL", "SQA"}
        );

        // Print User Info
        tekSchoolStudentObj.printStudentInfo();

        System.out.println(" * * * * * * * * * *  * * * * * * * * * *");

        collegeStudentObj.printCollegeStudentInfo();

    }

}
