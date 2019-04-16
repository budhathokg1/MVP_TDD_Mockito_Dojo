import java.util.List;

public interface Repository {
    List<Instructor> getInstructors();
    List<Student> getStudents();
    int getInstructorSize();
    int getStudentSize();


}
