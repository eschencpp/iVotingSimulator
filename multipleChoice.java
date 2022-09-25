public class multipleChoice implements Question {

    private String question;
    private String answer;

    @Override
    public String getQuestion() {
        // TODO Auto-generated method stub
        return this.question;
    }

    @Override
    public String getAnswer() {
        // TODO Auto-generated method stub
        return this.answer;
    }

    @Override
    public void setQuestion(String q) {
        this.question = q;
        
    }

    @Override
    public void setAnswer(String a) {
        this.answer = a;
        
    }
    
}
