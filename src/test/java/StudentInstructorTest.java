import org.junit.*;

import static org.junit.Assert.assertEquals;

public class StudentInstructorTest {

    @Test
    public void givenStudentLastName_WhenCallGetLastName_ReturnLastName() throws Exception {
        Student sut = new Student();
        sut.setLastName("Budhathoki");
        assertEquals("Budhathoki", sut.getLastName());

    }

    @Test
    public void givenStudentFirstName_WhenCallGetFirstName_ReturnFirstName() throws Exception {
        Student sut = new Student();
        sut.setFirstName("Ganesh");
        assertEquals("Ganesh", sut.getFirstName());

    }

    @Test
    public void givenStudentId_WhenCallGetStudentId_ReturnStudentId() throws Exception {
        Student sut = new Student();
        sut.setStudentId(1);
        assertEquals(1, sut.getStudentId());

    }

    @Test
    public void givenStudentMiddleName_WhenCallGetMiddleName_ReturnMiddleName() throws Exception {
        Student sut = new Student();
        sut.setMiddleName("Bikram");
        assertEquals("Bikram", sut.getMiddleName());

    }

    @Test
    public void givenStudentSuffix_WhenCallGetSuffix_ReturnSuffix() throws Exception {
        Student sut = new Student();
        sut.setSuffix("Junior");
        assertEquals("Junior", sut.getSuffix());

    }

    @Test
    public void givenStudentAge_WhenCallGetAge_ReturnAge() throws Exception {
        Student sut = new Student();
        sut.setAge(21);
        assertEquals(21, sut.getAge());

    }

    @Test
    public void givenInstructorName_WhenCallGetName_ReturnName() throws Exception {
        Instructor sut = new Instructor();
        sut.setIName("John Newman");
        assertEquals("John Newman", sut.getIName());

    }

    @Test
    public void givenInstructorTitle_WhenCallGetInstTitle_ReturnTitle() throws Exception {
        Instructor sut = new Instructor();
        sut.setTitle("Professor");
        assertEquals("Professor", sut.getTitle());

    }

    @Test
    public void givenCourseName_WhenCallGetCourse_ReturnCourse() throws Exception {
        Instructor sut = new Instructor();
        sut.setCourse("Computer Science");
        assertEquals("Computer Science", sut.getCourse());

    }

    @Test
    public void givenPrefix_WhenCallGetPrefix_ReturnPrefix() throws Exception {
        Instructor sut = new Instructor();
        sut.setPrefix("Dr.");
        assertEquals("Dr.", sut.getPrefix());

    }


}
