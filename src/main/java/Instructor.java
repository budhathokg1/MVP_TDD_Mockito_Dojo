public class Instructor {
    private String iName, title, prefix, course;

    public Instructor(){

    }

    public Instructor(String instName, String insTtitle, String instPrefix, String instCourse) {
        iName = instName;
        title = insTtitle;
        prefix = instPrefix;
        course = instCourse;

    }

    public String getIName() {
        return iName;
    }

    public void setIName(String iName) {
        this.iName = iName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
