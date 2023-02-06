package mvc;

public class quizDTO {
   private int num;
   private String question;
   private int answer;
   private int mark;
   private String mod;

   public quizDTO() {
   }

   public quizDTO(int num, String question, int answer, int mark, String mod) {
      super();
      this.num = num;
      this.question = question;
      this.answer = answer;
      this.mark = mark;
      this.mod = mod;
   }

   public quizDTO(int num, int answer) {
      this.num = num;
      this.answer = answer;
   }

   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }

   public String getQuestion() {
      return question;
   }

   public void setQuestion(String question) {
      this.question = question;
   }

   public int getAnswer() {
      return answer;
   }

   public void setAnswer(int answer) {
      this.answer = answer;
   }

   public int getMark() {
      return mark;
   }

   public void setMark(int mark) {
      this.mark = mark;
   }

   public String getMod() {
      return mod;
   }

   public void setMod(String mod) {
      this.mod = mod;
   };

}