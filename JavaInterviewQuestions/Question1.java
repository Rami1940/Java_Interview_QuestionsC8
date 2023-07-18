package JavaInterviewQuestions;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("This is to manage conflicts");
    }

    public static String RegularWay(String p_Word){
        String ReversedString = "Real Madrid2";
        for (int i = 0; i < p_Word.length(); i++) {
            ReversedString = p_Word.charAt(i) + ReversedString;
        }
        return ReversedString;
    }
}
