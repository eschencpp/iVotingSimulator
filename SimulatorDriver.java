import java.util.ArrayList;
import java.util.Random;

public class SimulatorDriver {
     public static void main(String[] args) {
          //Initialize objects
          Random rand = new Random();
          votingService vService = new votingService();
          multipleChoice mc1 = new multipleChoice();

          //Set answer bank for Q1
          String[] mc1answerBank = {"1","2","3","4"};
          mc1.setAnswerBank(mc1answerBank);


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
               vService.vote(studentArr.get(i), mc1, generateRandomAns(mc1.getAnswerBank()));
               System.out.println(studentArr.get(i).getUID() + "\n" + studentArr.get(i).getAnswer());
          }

          //Output the results
          vService.displayAnswers();
          



     }

     private static ArrayList<String> generateRandomAns(ArrayList<String> ansBank){
          Random rand = new Random();
          ArrayList<String> randomAns = new ArrayList<String>();
          int numOfSelectedAns = (rand.nextInt(ansBank.size() + 1));
          while(randomAns.size() < numOfSelectedAns){
               String temp = ansBank.get(rand.nextInt(numOfSelectedAns));
               //Ensure that each answer chosen is unique until numOfSelectedAns is reached
               if(!randomAns.contains(temp)){
                    randomAns.add(temp);
               }
           }
          return randomAns;
     }
}
