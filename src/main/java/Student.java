public class Student {

    private String firstName, lastName, middleName, suffix;
    private int studentId, age;

    public Student(){

    }

    public Student(String fName, String lName, String mName, String sfx, int StdId, int stdAge) {
        firstName = fName;
        lastName = lName;
        middleName = mName;
        suffix = sfx;
        studentId = StdId;
        age = stdAge;

    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getMiddleName() {

        return middleName;
    }

    public void setMiddleName(String middleName) {

        this.middleName = middleName;
    }

    public String getSuffix() {

        return suffix;
    }

    public void setSuffix(String suffix) {

        this.suffix = suffix;
    }

    public int getStudentId() {

        return studentId;
    }

    public void setStudentId(int studentId) {

        this.studentId = studentId;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
