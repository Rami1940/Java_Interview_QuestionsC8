package JavaInterviewQuestions;

public class Question1 {
    public static String RegularWay(String p_Word){
        String ReversedString = "";
        for (int i = 0; i < p_Word.length(); i++) {
            ReversedString = p_Word.charAt(i) + ReversedString;
        }
        return ReversedString;
    }
}
