import java.util.List;

public interface Presenter {
    List<Student> getSortedStudents();
    List<Instructor> getSortedInstructors();
    int getSortedStudentSize();
    int getSortedInstructorSize();

}
