public class multipleChoice extends Question {

    char answerBank[] = new char[]{ 'a','b','c','d','e','f','g','h','i'};
    


    //Take in parameter for the number of choices. Ex 4 would fill tempArr with a b c d and set answerBank to tempArr at the end
    public void setAnswerBank(int numOfChoices){
        char tempArr[] = new char[numOfChoices];
        for(int i = 0; i < numOfChoices; i++){
            tempArr[i] = answerBank[i];
        }

        answerBank = tempArr;
    }

    public char[] getAnswerBank(){
        return answerBank;
    }
}
