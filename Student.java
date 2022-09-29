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


    
    public void setAnswer(ArrayList<String> answer){
        stuAnswer = answer;

    }

    public String getUID(){
        return UID;
    }
}
