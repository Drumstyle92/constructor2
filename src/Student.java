/**
 * @author Drumstyle92
 * Class where there are student variables, a class construct and a printout of the class variables.
 */
public class Student {
     public String name;
    public int grade;

    /**
     *
     * @param studentName student name parameter.
     * Construct of the class in which printing is exited every time an object of the belonging class is created.
     */
    Student(String studentName){
        this.name = studentName;
        System.out.println(" Student object ");
    }

    /**
     * Student's name and grade print.
     */
    public void getStudentDetails(){
        System.out.println(" Student name: "+ this.name +" Grade: "+ this.grade);
    }
}
