import java.util.ArrayList;

public class SimulatorDriver {
     public static void main(String[] args) {
        multipleChoice mc1 = new multipleChoice();
        mc1.setAnswer("abd");

        Student student1 = new Student();
        student1.setAnswer("abd");

        ArrayList<Student> studentArr = new ArrayList<Student>();
        while(studentArr.size() < 5){
             studentArr.add(new Student());

        }
     }
}
