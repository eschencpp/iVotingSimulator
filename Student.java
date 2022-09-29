import java.util.ArrayList;
import java.util.UUID;  

public class Student {
    
    private String UID = UUID.randomUUID().toString();
    private ArrayList<String> stuAnswer = new ArrayList<String>();

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
