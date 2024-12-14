public class IUStudent extends Student {
    public IUStudent(String name, int course, int lastExamMark) {
        super(name, course, lastExamMark);
    }

    @Override
    public void writeExam() {
        System.out.println("Студент " + name + " " + course + " курса ИУ пишет экзамен");
    }
}
