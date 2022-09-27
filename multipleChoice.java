public class multipleChoice extends Question {

    String answerBank[] = new String[]{ "A","B","C","D","E","F","G","H","I"};
    


    //Take in parameter for the number of choices. Ex 4 would fill tempArr with a b c d and set answerBank to tempArr at the end
    public void setAnswerBank(int numOfChoices){
        String tempArr[] = new String[numOfChoices];
        for(int i = 0; i < numOfChoices; i++){
            tempArr[i] = answerBank[i];
        }

        answerBank = tempArr;
    }

    public String[] getAnswerBank(){
        return answerBank;
    }
}
