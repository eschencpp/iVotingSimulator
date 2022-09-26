import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    
    private static final AtomicInteger idGenerator = new AtomicInteger(1000);
    private int UUID = idGenerator.getAndIncrement();
    ArrayList<String> answer = new ArrayList<String>();
    Random rand = new Random();

    
    public Student(){
        this.UUID = idGenerator.getAndIncrement();
    }

    public ArrayList<String> getAnswer(){
        return answer;
    }


    /**
     * Randomly chooses answers for Student and stores in answer[]
     *
     * @param answerBank - The array of answers that can be chosen by Student
     * @param numOfSelectedAns - the number of answers that the student selects
     * @return void
     */
    public void setAnswer(char[] answerBank, int numOfSelectedAns){
        while(answer.size() < numOfSelectedAns){
            //Choose an answer from the answer bank
            String temp = String.valueOf(answerBank[rand.nextInt(numOfSelectedAns)]);
            //Ensure that each answer chosen is unique until numOfSelectedAns is reached
            if(!answer.contains(temp)){
                answer.add(temp);
            }
        }
    }

    public int getUID(){
        return UUID;
    }
}
