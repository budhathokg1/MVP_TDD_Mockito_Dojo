import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Instructor> instructors = new ArrayList<>();

    public RepositoryImpl(){
        students.add(new Student("Ganesh", "Budhathoki", "Bikram", "Mr", 1, 21));
        students.add(new Student("Devin", "Workman", "Blah", "Mr", 2, 22));
        students.add(new Student("Adel", "Sultan", "Mohameed", "Mr", 3, 24));
        students.add(new Student("Tobel", "Atnafu", "Wubshet", "Mr", 4, 19));

        instructors.add(new Instructor("Ganesh", "professor", "Dr", "CSC 439"));
        instructors.add(new Instructor("Tobel", "associate professor", "Prof", "MAT 302"));
        instructors.add(new Instructor("Brent", "professor", "Dr", "CSC 402"));

    }

    @Override
    public List<Instructor> getInstructors() {

        return instructors;
    }

    @Override
    public List<Student> getStudents() {

        return students;
    }

    @Override
    public int getInstructorSize() {
        return instructors.size();
    }

    @Override
    public int getStudentSize() {
        return students.size();
    }
}
