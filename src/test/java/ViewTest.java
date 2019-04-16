import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ViewTest {
    View sut;

    @Mock
    View mockView;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        sut = new View( new PresenterImpl( new RepositoryImpl()));
    }

    @Test
    public void givenView_whenCallGetStudentFormattedData_thenReturnFormattedStudentData(){
        when(mockView.getStudentFormattedData(0)).thenReturn(getMockedStudentFormattedData());

        String mockedStudentData = mockView.getStudentFormattedData(0);
        String studentData = sut.getStudentFormattedData(0);
        assertEquals(mockedStudentData, studentData);
        assertEquals(4, sut.getStudentSize());


    }

    public String getMockedStudentFormattedData(){
        return "Atnafu, Mr. Tobel - Age 19";


    }

    @Test
    public void givenView_whenCallGetInstructorFormattedData_thenReturnFormattedInstructorData(){
        when(mockView.getInstructorFormattedData(0)).thenReturn(getMockedInstructorFormattedData());

        String mockedInstructorData = mockView.getInstructorFormattedData(0);
        String instructorData = sut.getInstructorFormattedData(0);
        assertEquals(mockedInstructorData, instructorData);
        assertEquals(3, sut.getInstructorSize());
    }

    public String getMockedInstructorFormattedData(){
        return "Dr Brent, professor, CSC 402";
    }

}
