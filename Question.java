/**
 * Question
 */
abstract class Question {

    String question;
    String answer;

    
    public String getQuestion() {
        // TODO Auto-generated method stub
        return this.question;
    }

    
    public String getAnswer() {
        // TODO Auto-generated method stub
        return this.answer;
    }

    
    public void setQuestion(String q) {
        this.question = q;
        
    }

    public void setAnswer(String a) {
        this.answer = a;
        
    }
}