/**
 * @author Drumstyle92
 * class testing the program.
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * Class where Student and Teacher objects will be created inside and students' names and grades will be printed.
     */
    public static void main(String[] args){
        //Objects in play.
        System.out.println("--------------------------------------------------");
        Student student1 = new Student(" Dino ");
        Student student2 = new Student(" Simone ");
        Teacher teacher = new Teacher();

        //The name of the teacher and grades assigned by the teacher.
        System.out.println("---------------------------------------------------");
        teacher.teacherName = " Victoria ";
        teacher.assignGrade(student1,8);
        teacher.assignGrade(student2,7);
        //print on students' names and their grades.
        System.out.println("---------------------------------------------------");
        student1.getStudentDetails();
        student2.getStudentDetails();
        System.out.println("----------------------------------------------------");
    }
}
