import java.util.ArrayList;
import java.util.Arrays;

abstract class Question {

    protected String question;
    protected ArrayList<String> answerKey;
    protected ArrayList<String> answerBank = new ArrayList<String>();

    
    public String getQuestion() {
        // TODO Auto-generated method stub
        return this.question;
    }

    
    public ArrayList<String> getAnswerKey() {
        // TODO Auto-generated method stub
        return this.answerKey;
    }

    
    public void setQuestion(String q) {
        this.question = q;
        
    }

        public void setAnswerBank(String[] choices){
        this.answerBank.addAll(Arrays.asList(choices));
    }

    public ArrayList<String> getAnswerBank(){
        return answerBank;
    }
}