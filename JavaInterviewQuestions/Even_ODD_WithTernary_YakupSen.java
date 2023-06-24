package JavaInterviewQuestions;

import java.util.Scanner;

public class Even_ODD_WithTernary_YakupSen {
    public static void main(String[] args) {


    //find the number if it is even or odd


   //lets ask a user to enter the number
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number=scan.nextInt();


   //with ifelse
        /*
    if(number%2==0){
        System.out.println("it is even number");
    }else{
        System.out.println("it is odd number");
    }

         */

        //we need to store the output in string
        String result=(number%2==0) ? "Even" :"odd";
        System.out.println(result);
        //new
}
}
