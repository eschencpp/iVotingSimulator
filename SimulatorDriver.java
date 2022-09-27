import java.util.ArrayList;
import java.util.Random;
public class SimulatorDriver {
     public static void main(String[] args) {
          Random rand = new Random();
          votingService vService = new votingService();
          multipleChoice mc1 = new multipleChoice();
          mc1.setAnswerBank(4);


          //Print Question Prompt
          mc1.setQuestion("What is the answer");
          System.out.println(mc1.getQuestion());


          //Create 5 students
          ArrayList<Student> studentArr = new ArrayList<Student>();
          while(studentArr.size() < 5){
               studentArr.add(new Student());
          }

          //Generate random answers for Students
          for(int i = 0; i < studentArr.size(); i++){
               vService.vote(studentArr.get(i), mc1.getAnswerBank(), (rand.nextInt(mc1.getAnswerBank().length) + 1));
               System.out.println(studentArr.get(i).getUID() + "\n" + studentArr.get(i).getAnswer());
          }

          //Output the results
          vService.displayAnswers();
          



     }
}
