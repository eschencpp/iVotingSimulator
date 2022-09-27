import java.util.ArrayList;
import java.util.Random;
public class SimulatorDriver {
     public static void main(String[] args) {
          Random rand = new Random();
          votingService vService = new votingService();

          multipleChoice mc1 = new multipleChoice();
          mc1.setAnswerBank(4);
          char[] mc1Choices = mc1.getAnswerBank();
          System.out.println(mc1Choices.length);


          mc1.setQuestion("What is the answer");
          System.out.println(mc1.getQuestion());


          //Create 5 students
          ArrayList<Student> studentArr = new ArrayList<Student>();
          while(studentArr.size() < 5){
               studentArr.add(new Student());
          }

          //Gather all answers. Used for output
          ArrayList<String> totalAnswers = new ArrayList<>();

          //Generate random answers for Students
          for(int i = 0; i < studentArr.size(); i++){
               studentArr.get(i).setAnswer(mc1.getAnswerBank(), 1+ rand.nextInt(mc1.getAnswerBank().length - 1));
               System.out.println(studentArr.get(i).getAnswer());

               //Aggregate all answers
               totalAnswers.addAll(studentArr.get(i).getAnswer());
          }

          //Output the results
          vService.displayAnswers(totalAnswers);
          



     }
}
