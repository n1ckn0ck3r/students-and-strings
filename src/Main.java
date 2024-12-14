public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new MathStudent("Игорь", 2, 5);
        students[1] = new IUStudent("Виктория", 3, 4);

        for (Student student : students) {
            student.writeExam();
        }

        StringList strings = new StringList();
        strings.addString("Privet");
        strings.addString("sdsd");
        strings.addString("DJSKDNSKJnd");
        System.out.println(strings.getAverageLength());
        System.out.println(strings.getMaxLengthString());
    }
}
