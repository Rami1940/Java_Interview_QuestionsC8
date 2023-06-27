package JavaInterviewQuestions;

public class Question10_swapNumbers_pinar {
    //swap values of two variables

    public static void main(String[] args) {
        //method 1 - swapping with a temp variable

        int a = 5;
        int b = 7;

        System.out.println("original a = "+a);
        System.out.println("original b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swap a = "+a);
        System.out.println("after swap b = "+b);


        //swap values without assigning a new variable
        int x = 10;
        int y = 20;
        System.out.println("original x = "+x);
        System.out.println("original y = "+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("after swap x = "+x);
        System.out.println("after swap y = "+y);

    }



}
