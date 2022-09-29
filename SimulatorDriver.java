import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimulatorDriver {
     public static void main(String[] args) {
          //Initialize votingService
          votingService vService = new votingService();
          System.out.println("Welcome to IVoteService");
          //Create multiple choice question 1 and set question,choices, and answer key
          multipleChoice mc1 = new multipleChoice();
          //Set Question Prompt
          mc1.setQuestion("What is the answer");
          System.out.println(mc1.getQuestion());
          //Set answer bank
          String[] mc1answerBank = {"1","2","3","4"};
          mc1.setAnswerBank(mc1answerBank);
          //Set answer key
          ArrayList<String> mc1Key = new ArrayList<> (Arrays.asList("1","2"));
          mc1.setAnswer(mc1Key);

          //Create 10 students
          ArrayList<Student> studentArr = new ArrayList<Student>();
          while(studentArr.size() < 10){
               studentArr.add(new Student());
          }

          //Generate random answers for Students
          for(int i = 0; i < studentArr.size(); i++){
               vService.vote(studentArr.get(i), mc1, generateRandomAns(mc1.getAnswerBank()));
               System.out.printf("StudentID: %s\n",studentArr.get(i).getUID());
               System.out.println("Answer: " + studentArr.get(i).getAnswer());
          }

          //Output the results
          vService.displayAnswers();
          System.out.println(vService.gradeAnswers(studentArr, mc1));
          
          //Reset vote service for next question
          vService.reset(studentArr);


          //Single Answer Question
          singleAnswer sa1 = new singleAnswer();
          String[] sa1answerBank = {"A","B","C","D","E","F","G"};
          sa1.setAnswerBank(sa1answerBank);
          ArrayList<String> sa1Key = new ArrayList<> (Arrays.asList("A"));
          sa1.setAnswer(sa1Key);

          //Generate random answers for Students
          for(int i = 0; i < studentArr.size(); i++){
               vService.vote(studentArr.get(i), sa1, generateRandomAns(sa1.getAnswerBank()));
               System.out.println(studentArr.get(i).getUID() + "\n" + studentArr.get(i).getAnswer());
          }

          //Output the results
          vService.displayAnswers();
          System.out.println(vService.gradeAnswers(studentArr, sa1));
          vService.reset(studentArr);

     }

     //Generate random answers for students
     private static ArrayList<String> generateRandomAns(ArrayList<String> ansBank){
          Random rand = new Random();
          ArrayList<String> randomAns = new ArrayList<String>();
          int numOfSelectedAns = (1 + rand.nextInt(ansBank.size()));
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
