public abstract class Student {
    protected String name;
    protected int course;
    protected int lastExamMark;

    public Student(String name, int course, int lastExamMark) {
        this.name = name;
        this.course = course;
        this.lastExamMark = lastExamMark;
    }

    public abstract void writeExam();
}
