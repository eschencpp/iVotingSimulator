import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;  

public class Student {
    
    
    String UID = UUID.randomUUID().toString();
    ArrayList<String> stuAnswer = new ArrayList<String>();
    Random rand = new Random();

    
    public Student(){

    }

    public ArrayList<String> getAnswer(){
        return stuAnswer;
    }


    /**
     * Randomly chooses answers for Student and stores in answer[]
     *
     * @param answerBank - The array of answers that can be chosen by Student
     * @param numOfSelectedAns - the number of answers that the student selects
     * @return void
     */
    public void setAnswer(ArrayList<String> answer){
        stuAnswer = answer;

    }

    public String getUID(){
        return UID;
    }
}
