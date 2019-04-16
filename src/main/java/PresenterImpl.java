import java.util.List;


public class PresenterImpl implements Presenter{
    private Repository repository;

    public PresenterImpl(Repository sr)
    {
        repository = sr;
    }

    public List<Student> getSortedStudents() {
        List<Student> students = repository.getStudents();
        students.sort((e, e2) -> e.getLastName().compareTo(e2.getLastName()));
        return students;
    }

    public List<Instructor> getSortedInstructors() {
        List<Instructor> instructors = repository.getInstructors();
        instructors.sort((e, e2) -> e.getIName().compareTo(e2.getIName()));
        return instructors;
    }

    @Override
    public int getSortedStudentSize() {
        return repository.getStudentSize();
    }

    @Override
    public int getSortedInstructorSize() {
        return repository.getInstructorSize();
    }


}
