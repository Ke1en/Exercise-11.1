public class Student {
    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void outputStudentGrades() {
        System.out.println("Студент " + name + " имеет оценку " + grade);
    }
}
