package JavaInterviewQuestions;

public class MostPoeticWordInParagraph_Rami {


// I tried to solve the question in a different way
// let me know if you have any feedback or any questions :)

    public static void main(String[] args) {

        String str = "and the garden diminishes: grape leaves rumpled and rusty, zucchini felled by borers, tomatoes sparse on the vines";
        String[] strgs = str.split(" ");

        for (int i = 0; i < strgs.length; i++) {
            char[] ch = strgs[i].toCharArray();
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                char chara = ch[j];
                if (chara == 'a') {
                    count++;
                } else if (chara == 'b') {
                    count++;
                } else if (chara == 'c') {
                    count++;
                } else if (chara == 'd') {
                    count++;
                } else if (chara == 'e') {
                    count++;
                } else if (chara == 'f') {
                    count++;
                }
            }
            System.out.println(strgs[i] + " = " + count);

        }


    }
}