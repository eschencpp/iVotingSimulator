import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class votingService {
    static ArrayList<String> totalAnswers = new ArrayList<>();

    public void vote(Student student, String[] answerBank, int randNum){
        student.setAnswer(answerBank, randNum);
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
