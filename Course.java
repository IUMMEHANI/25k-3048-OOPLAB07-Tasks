package POLYMORPHISM;

class Course {
    double calculateGrade(int assignments, int exams) {
        return 0;
    }
    public static void main(String[] args) {
        Course c;
        c = new ProgrammingCourse();
        System.out.println("Programming Grade = " + c.calculateGrade(80, 90));
        c = new MathematicsCourse();
        System.out.println("Mathematics Grade = " + c.calculateGrade(80, 90));
        c = new DesignCourse();
        System.out.println("Design Grade = " + c.calculateGrade(80, 90));
    }
}
class ProgrammingCourse extends Course {
    double calculateGrade(int assignments, int exams) {
        return assignments * 0.4 + exams * 0.6;
    }
}
class MathematicsCourse extends Course {
    double calculateGrade(int assignments, int exams) {
        return assignments * 0.3 + exams * 0.7;
    }
}
class DesignCourse extends Course {
    double calculateGrade(int assignments, int exams) {
        return assignments * 0.5 + exams * 0.5;
    }
}
