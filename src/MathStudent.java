public class MathStudent extends Student {
    public MathStudent(String name, int course, int lastExamMark) {
        super(name, course, lastExamMark);
    }

    @Override
    public void writeExam() {
        System.out.println("Студент " + name + " " +  course + " курса математического направления пишет экзамен");
    }
}
