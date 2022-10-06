import org.jetbrains.annotations.NotNull;

/**
 * class of teachers.
 */
public class Teacher {
    /**
     *  name of the teacher.
     */
    String teacherName;

    /**
     * a constructor method that simply inform the user about the creation of a Teacher object.
     */
    Teacher(){
        System.out.println(" Teacher object ");
    }

    /**
     *
     * @param alun Student object parameter.
     * @param finalGrade parameter of the grade that the teacher will give.
     *
     */
    public void assignGrade(@NotNull Student alun , int finalGrade){
        System.out.print("The teacher's grade is ");
        System.out.println(alun.grade = finalGrade);
    }
}
