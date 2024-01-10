import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface ShowInfo {
    boolean show() default true;
}

class Student {
    @ShowInfo
    private String firstName;

    @ShowInfo
    private String lastName;

    @ShowInfo
    private int age;

    @ShowInfo(show = false)
    private int examScore;

    private void passExamSuccessfully() {
        this.examScore = 100;
    }

    private int getExamScore() {
        return examScore;
    }
}

class StudentInfoPrinter {
    public void printStudentInfo(Student student) {
        Class<?> studentClass = student.getClass();

        for (java.lang.reflect.Field field : studentClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(ShowInfo.class)) {
                ShowInfo annotation = field.getAnnotation(ShowInfo.class);
                if (annotation.show()) {
                    field.setAccessible(true);
                    try {
                        System.out.println(field.getName() + ": " + field.get(student));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            Class<?> studentClass = student.getClass();

            java.lang.reflect.Field firstNameField = studentClass.getDeclaredField("firstName");
            java.lang.reflect.Field lastNameField = studentClass.getDeclaredField("lastName");
            java.lang.reflect.Field ageField = studentClass.getDeclaredField("age");

            firstNameField.setAccessible(true);
            lastNameField.setAccessible(true);
            ageField.setAccessible(true);

            firstNameField.set(student, "Даня");
            lastNameField.set(student, "фів");
            ageField.set(student, 20);

            java.lang.reflect.Method passExamMethod = Student.class.getDeclaredMethod("passExamSuccessfully");
            passExamMethod.setAccessible(true);
            passExamMethod.invoke(student);

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        StudentInfoPrinter printer = new StudentInfoPrinter();
        printer.printStudentInfo(student);

        try {
            java.lang.reflect.Method getExamScoreMethod = Student.class.getDeclaredMethod("getExamScore");
            getExamScoreMethod.setAccessible(true);
            int newExamScore = (int) getExamScoreMethod.invoke(student);

            System.out.println("New Exam Score: " + newExamScore);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
