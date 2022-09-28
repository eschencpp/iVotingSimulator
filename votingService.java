import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class votingService {
    static ArrayList<String> totalAnswers = new ArrayList<>();

    public void vote(Student student, multipleChoice q, ArrayList<String> answer){
        //Check if student has previously submitted answer
        if(!student.getAnswer().isEmpty()){
            student.getAnswer().clear();
        }
        student.setAnswer(answer);
        totalAnswers.addAll(student.getAnswer());
    }

    public void vote(Student student, singleAnswer q, ArrayList<String> answer){
        student.setAnswer(answer);
        totalAnswers.addAll(student.getAnswer());
    }


    public static void displayAnswers()
    {
        // hashmap to store the frequency of element
        Map<String, Integer> hm = new HashMap<String, Integer>();
        
        for (String i : totalAnswers) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
 
        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() +" : " + val.getValue());
        }
    }
}
