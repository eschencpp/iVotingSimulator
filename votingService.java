import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class votingService {
    
    public void vote(){
        
    }

    public static void displayAnswers(ArrayList<String> ans)
    {
        // hashmap to store the frequency of element
        Map<String, Integer> hm = new HashMap<String, Integer>();
        
        for (String i : ans) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
 
        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() +" : " + val.getValue());
        }
    }
}
