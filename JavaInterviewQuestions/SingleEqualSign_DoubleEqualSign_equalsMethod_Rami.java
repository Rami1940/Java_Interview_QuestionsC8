package JavaInterviewQuestions;

public class SingleEqualSign_DoubleEqualSign_equalsMethod_Rami {

    // Question 9: String Pool and == operator to compare references in Java.
    // Another way of asking this question could be: What is the difference between = , ==, and equals()

    // = : this operator is used to assign values to variables. Ex: int x = 20;

    // == : this operator is used to compare the content of two variables and their location is memory.
    // both must be true so that it returns true

    // equals() : this is a method that compares the content of two variables regardless of where they are stored
    // if the content is the same, it is sufficient and it will return true

    public static void main(String[] args) {

// =
        String first_name = "Bellingham"; // here we assigned the vale "Bellingham" to the variable first_name
        first_name = "Jude"; // we messed up, so we are now assigning the value "Jude" to first_name.
        // the variable first_name had a value in line 18, and now has a different value in line 19 because we assigned another value to it

// To understand == vs. equals() we need to create 3 Strings:
        // car_StringPool1 = "BMW" ------> Stored in the String pool
        // car_StringPool2 = "BMW" ------> Stored in the String pool
        // car_HeapMemory = "BMW"  ------> Stored in the Heap Memory


        String car_StringPool1 = "BMW"; // Once you create a String, Java looks in the String pool to see if you created it before
        // so that it can reuse it for the sake of memory efficiency. If you didn't create it, it will save it as a new variable in the String pool

        String car_StringPool2 = "BMW"; // Java looked in the String pool, found that you already have a String with value "BMW"
        // it will not create a new variables but rather reference both variable to both point to the same value


        // lets use == and equals() with both variables to se what happens:
        boolean sameValueSameLocation_doubleEqSigns = car_StringPool1 == car_StringPool2;
        System.out.println("sameValueSameLocation_doubleEqSignes = " + sameValueSameLocation_doubleEqSigns);
        // this will be "true" because both values are the same and are stored in the String pool

        boolean sameValueSameLocation_equalsMethod = car_StringPool1.equals(car_StringPool2);
        System.out.println("sameValueSameLocation_equalsMethod = " + sameValueSameLocation_equalsMethod);
        // this also will be true because because both values are the same, the memory location didn't matter

        // let's now create a String with the same value, but force Java to save it in the heap memory and not in the String pool
        String car_HeapMemory = new String("BMW");

        // lets use == and equals() with both variables to se what happens:

        boolean sameValueDiffLocation_doubleEqSigns = car_StringPool1==car_HeapMemory;
        System.out.println("sameValueDiffLocation_doubleEqSigns = " + sameValueDiffLocation_doubleEqSigns);
        // this will be false because the variables have the same content, BUT stored in different locations
        // == compares the content of the variables AND the location where they are stored
        // They both must be true so that it returns true

        boolean sameValeDiffLocations_equalsMethod = car_StringPool1.equals(car_HeapMemory);
        System.out.println("sameValeDiffLocations_equalsMethod = " + sameValeDiffLocations_equalsMethod);
        // this will be true, because equals() compares the content of the variables
        // and does not care that they are stored in two different locations

// I hope this helped
    }




}
