import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class votingService {
    static ArrayList<String> totalAnswers = new ArrayList<String>();

    /**
    * Method to vote for multiple choice questions
    */
    public void vote(Student student, multipleChoice q, ArrayList<String> answer){
        //Check if student has previously submitted answer
        if(!student.getAnswer().isEmpty()){
            student.getAnswer().clear();
        }
        student.setAnswer(answer);
        totalAnswers.addAll(student.getAnswer());
    }

    /**
    * Method to vote for single answer questions.
    */
    public void vote(Student student, singleAnswer q, ArrayList<String> answer){
        //Ensure multiple answers are not chosen
        if(answer.size() > 1){
            String singleAns = answer.get(answer.size() - 1);
            student.getAnswer().add(singleAns);
        } else{
            student.setAnswer(answer);
        }
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

    public static int gradeAnswers(ArrayList<Student> students, Question q){
        int totalCorrect = 0;
        ArrayList<String> studentAns;
        ArrayList<String> ansKey = q.getAnswerKey();
        for(int i = 0; i < students.size(); i++){
            studentAns = students.get(i).getAnswer();
            Collections.sort(studentAns);
            Collections.sort(ansKey);
            if(studentAns.equals(ansKey)){
                totalCorrect++;
            } 
        }
        return totalCorrect;
    }

    public static void reset(ArrayList<Student> students){
        totalAnswers.clear();

        for(int i = 0; i < students.size(); i++){
            students.get(i).getAnswer().clear();
        }
    }
}
