public class View {
    private Presenter presenter;

    public View(Presenter pr) {
        presenter = pr;

    }

    public String getStudentFormattedData(int index){
        Student student = presenter.getSortedStudents().get(index);
        return student.getLastName() + ", " +
                student.getSuffix() + ". " +
                student.getFirstName() + " - Age " +
                student.getAge();


    }

    public String getInstructorFormattedData(int index){
        Instructor instructor = presenter.getSortedInstructors().get(index);
        return instructor.getPrefix() + " " +
                instructor.getIName() + ", " +
                instructor.getTitle() + ", " +
                instructor.getCourse();

    }

    public int getStudentSize(){
        return presenter.getSortedStudentSize();
    }

    public int getInstructorSize(){
        return presenter.getSortedInstructorSize();
    }


}
