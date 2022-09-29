/* Eric Chen
 * CS3560 Project 1
 * 09/29/2022
 */ 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimulatorDriver {
     public static void main(String[] args) {
          //Initialize votingService
          votingService vService = new votingService();
          System.out.println("Welcome to IVoteService");

          //Create 10 students
          ArrayList<Student> studentArr = new ArrayList<Student>();
          while(studentArr.size() < 10){
               studentArr.add(new Student());
          }
          System.out.printf("The current number of students in this session is: %d\n\n", studentArr.size());

          //Create multiple choice question 1 and set question,choices, and answer key
          multipleChoice mc1 = new multipleChoice();
          //Set Question Prompt
          mc1.setQuestion("MC1. Which of the following are programming languages?");
          System.out.println(mc1.getQuestion());
          //Set answer bank
          String[] mc1answerBank = {"A. Java","B. PHP","C. Python","D. Spanish"};
          mc1.setAnswerBank(mc1answerBank);
          System.out.println("The choices are: " + mc1.getAnswerBank());
          //Set answer key
          ArrayList<String> mc1Key = new ArrayList<> (Arrays.asList("A. Java","B. PHP","C. Python"));
          mc1.setAnswer(mc1Key);

          //Students send vote
          for(int i = 0; i < studentArr.size(); i++){
               vService.vote(studentArr.get(i), mc1, generateRandomAns(mc1.getAnswerBank()));
               System.out.printf("\nStudentID: %s\n",studentArr.get(i).getUID());
               System.out.println("Answer: " + studentArr.get(i).getAnswer());
          }

          //Output the results
          System.out.println("\nVoting has ended. Here are the results:");
          vService.displayAnswers();
          System.out.println("The correct answer is: "+mc1Key);
          System.out.printf("The number of students that answered correctly are: %d\n",vService.gradeAnswers(studentArr, mc1));
          System.out.printf("%% %.2f of students got the answer correct.\n\n", ((float)vService.gradeAnswers(studentArr, mc1)/studentArr.size()) * 100);
          
          //Reset vote service for next question
          vService.reset(studentArr);

          System.out.println("-----------------------------------------------------------------");
          //Single Answer Question
          singleAnswer sa1 = new singleAnswer();
          sa1.setQuestion("SA1. Which continent is Canada located in?");
          System.out.println(sa1.getQuestion());
          String[] sa1answerBank = {"A. North America","B. Asia","C. Africa","D. Europe"};
          sa1.setAnswerBank(sa1answerBank);
          System.out.println("The choices are: " + sa1.getAnswerBank());
          ArrayList<String> sa1Key = new ArrayList<> (Arrays.asList("A. North America"));
          sa1.setAnswer(sa1Key);

          //Generate random answers for Students
          for(int i = 0; i < studentArr.size(); i++){
               vService.vote(studentArr.get(i), sa1, generateRandomAns(sa1.getAnswerBank()));
               System.out.printf("\nStudentID: %s\n",studentArr.get(i).getUID());
               System.out.println("Answer: " + studentArr.get(i).getAnswer());
          }

          //Output the results
          System.out.println("\nVoting has ended. Here are the results:");
          vService.displayAnswers();
          System.out.println("The correct answer is: "+sa1Key);
          System.out.printf("The number of students that answered correctly are: %d\n",vService.gradeAnswers(studentArr, sa1));
          System.out.printf("%% %.2f of students got the answer correct.\n\n", ((float)vService.gradeAnswers(studentArr, sa1)/studentArr.size()) * 100);

     }

     /**
     * Generate random answers for students
     * @param  ansBank the answer choices that can be randomly selected
     * @return an ArrayList of the selected answers
     */
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
