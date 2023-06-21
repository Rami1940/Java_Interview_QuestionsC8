package JavaInterviewQuestions;


public class Question12_Roman {
    //12. Remove duplicates from a string.
    // Write a method that accepts one string argument and returns it without duplicates.
    //We will see two versions of this method.

    // removeDup("hello")  -> "helo"
    // removeDup("apple")  -> "aple"
    // removeDup("aaaaaa") -> "a"
    // removeDup("abc")    -> "abc"

    public static void main(String[] args) {


        System.out.println("The input word is Mammamia");
        System.out.println("The output word is "+removeDuplicates("Mammamia"));
    }

    //this method take string remove duplicates and return the new one
    public static String removeDuplicates(String word) {


        // I ran your code, but it did'nt detect letters in capital letter.
        // so I added this line below to make all words lower case.
        // let me know if have a better idea of catching lower and upper case
       word = word.toLowerCase();

        //we need to create an empty string where we will store only unique value of string
        String withoutDuplicates = "";

        //next step we need to create a char array, this array will include all single characters related to our string,
        //because we use toCharArray method which split and convert string to array.

        char[] charArray = word.toCharArray();

        //Since we don't worry about iterator we will use for each loop, because we go over each element of array
        for (char ch : charArray) {
            //this condition will check if our new string already contains same value
            //since we use contain method which is only related to string we need to convert out single char to string using valueOf method:
            if (!withoutDuplicates.contains(String.valueOf(ch))) {

                //if value unique add to empty string
                withoutDuplicates = withoutDuplicates + ch;
            }
        }

        //example with regular loop
//        for (int i=0; i< charArray.length; i++){
//            if (!withoutDuplicates.contains(String.valueOf(charArray[i]))) {
//                withoutDuplicates = withoutDuplicates + charArray[i];
//            }
//        }


        return withoutDuplicates;
    }


}

