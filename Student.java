import java.util.concurrent.atomic.AtomicInteger;
public class Student {
    
    private static final AtomicInteger idGenerator = new AtomicInteger(1000);
    private int UUID = idGenerator.getAndIncrement();


    public Student(){
        
    }
}
