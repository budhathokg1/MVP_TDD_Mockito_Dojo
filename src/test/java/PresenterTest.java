import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class PresenterTest {
    PresenterImpl sut;

    @Mock Presenter mockPresenter;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        sut = new PresenterImpl(new RepositoryImpl());
    }

    @Test
    public void givenPresenter_whenCallGetSortedStudents_thenReturnSortedStudents() {
        when(mockPresenter.getSortedStudents()).thenReturn(getSortedStudentMocktArrayList());

        List<Student> mockedSortedStudents = mockPresenter.getSortedStudents();
        List<Student> sortedStudents = sut.getSortedStudents();

        assertEquals(mockedSortedStudents.size(), sut.getSortedStudentSize());

        for(int i = 0; i < sortedStudents.size(); i++){
            assertEquals(sortedStudents.get(i).getLastName(), mockedSortedStudents.get(i).getLastName());
        }

    }

    private List<Student> getSortedStudentMocktArrayList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tobel", "Atnafu", "Wubshet", "Mr", 4, 19));
        students.add(new Student("Ganesh", "Budhathoki", "Bikram", "Mr", 1, 21));
        students.add(new Student("Adel", "Sultan", "Mohameed", "Mr", 3, 24));
        students.add(new Student("Devin", "Workman", "Blah", "Mr", 2, 22));
        return students;
    }

    @Test
    public void givenPresenter_whenCallGetSortedInstructors_thenReturnSortedInstructors() {
        when(mockPresenter.getSortedInstructors()).thenReturn(getSortedInstructorsMockArrayList());

        List<Instructor> mockedSortedInstructors = mockPresenter.getSortedInstructors();
        List<Instructor> sortedInstructors = sut.getSortedInstructors();

        assertEquals(mockedSortedInstructors.size(), sut.getSortedInstructorSize());

        for(int j = 0; j < sortedInstructors.size(); j++){
            assertEquals(sortedInstructors.get(j).getIName(), mockedSortedInstructors.get(j).getIName());
        }

    }

    private List<Instructor> getSortedInstructorsMockArrayList() {
        List<Instructor> instructors = new ArrayList<>();

        instructors.add(new Instructor("Brent", "professor", "Dr", "CSC 402"));
        instructors.add(new Instructor("Ganesh", "professor", "Dr", "CSC 439"));
        instructors.add(new Instructor("Tobel", "associate professor", "Prof", "MAT 302"));

        return instructors;
    }

}
