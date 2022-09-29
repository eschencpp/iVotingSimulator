import java.util.ArrayList;
public class singleAnswer extends Question {

    /**
    * Set answer key for question
    * If the answer key has multiple answers, pick the last one in the array and warn user.
    * @param  ansKey the answer to the question
    */
    public void setAnswer(ArrayList<String> ansKey) {
        if(ansKey.size() > 1){
            System.out.printf("Warning. Multiple answers detected for question type Single Answer." 
                               + "The answer has been set to the last input: %s",ansKey.size() - 1);
            this.answerKey.add(ansKey.get(ansKey.size() - 1));
        }
        this.answerKey = ansKey;
    }
}

