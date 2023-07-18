package JavaInterviewQuestions;

public class Question2 {
    public static String UsingStringBuilder(String p_Word){
        StringBuilder SB = new StringBuilder(p_Word);
        SB.reverse();
        return SB.toString();
    }
}
