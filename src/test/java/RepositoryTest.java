import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class RepositoryTest {
    RepositoryImpl sut;

    @Mock
    Repository mockRepo;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        sut = new RepositoryImpl();
    }


    @Test
    public void givenInstructorRepo_WhenCallGetAllInstructors_ThenReturnsAllInstructorsSize(){
        when(mockRepo.getInstructors()).thenReturn(getInstructorTestArrayList());
        List<Instructor> repoInstructors = sut.getInstructors();
        List<Instructor> mockRepoInstructor = mockRepo.getInstructors();

        Assert.assertEquals(sut.getInstructorSize(), mockRepoInstructor.size());

        for (int i = 0; i < repoInstructors.size(); i++) {
            Assert.assertEquals(mockRepoInstructor.get(i).getIName(), repoInstructors.get(i).getIName());
        }
    }

    private List<Instructor> getInstructorTestArrayList() {
        List<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("Ganesh", "professor", "Dr", "Computer Science"));
        instructors.add(new Instructor("Tobel", "associate professor", "Prof", "Chemistry"));
        instructors.add(new Instructor("Brent", "professor", "Dr", "Computer Science"));

        return instructors;
    }

    @Test
    public void givenStudentRepo_WhenCallGetAllStudents_ThenReturnsAllStudents(){
        when(mockRepo.getStudents()).thenReturn(getStudentTestArrayList());

        List<Student> repoStudents = sut.getStudents();
        List<Student> mockRepoStudents = mockRepo.getStudents();
        Assert.assertEquals(sut.getStudentSize(), mockRepoStudents.size());

        for (int i = 0; i < repoStudents.size(); i++) {
            Assert.assertEquals(mockRepoStudents.get(i).getFirstName(), repoStudents.get(i).getFirstName());
        }


    }

    private List<Student> getStudentTestArrayList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ganesh", "Budhathoki", "Bikram", "Mr", 1, 21));
        students.add(new Student("Devin", "Workman", "Blah", "Mr", 2, 22));
        students.add(new Student("Adel", "Sultan", "Mohameed", "Mr", 3, 24));
        students.add(new Student("Tobel", "Atnafu", "Wubshet", "Mr", 4, 19));
        return students;
    }
}
