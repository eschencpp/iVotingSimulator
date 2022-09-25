import java.util.concurrent.atomic.AtomicInteger;
public class Student {
    
    private static final AtomicInteger idGenerator = new AtomicInteger(1000);
    private int UUID = idGenerator.getAndIncrement();
    private String answer;

    public Student(){
        
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String ans){
        this.answer = ans;
    }

    public void setUID(){
        UUID = idGenerator.getAndIncrement();
    }

    public int getUID(){
        return UUID;
    }
}
