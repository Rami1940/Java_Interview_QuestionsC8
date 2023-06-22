// Write a method which take not sorted array and sorted it.
// [4,1,5,8,2,3] => [1,2,3,4,5,8]

// [1,2,3,4,5]

// 2 minutes for thinking
// 2 minutes explain your approach

import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        int[] arrayNotSortedExample = new int[]{4,1,5,8,2,3};
        int[] sortedArray = sortTheArray(arrayNotSortedExample);
        System.out.println(Arrays.toString(sortedArray));
    }
    
    public static int[] sortTheArray(int[] arrayNotSorted){
        
        for(int a=0; a<arrayNotSorted.length; a++){
           
           for(int b=a+1; b<arrayNotSorted.length; b++){
               
               int temp=0;
               if(arrayNotSorted[b] < arrayNotSorted[a]){
                   
                   //[4,1,5,8,2,3]
                   
                   temp = arrayNotSorted[a]; // 4
                   arrayNotSorted[a] = arrayNotSorted[b]; //[1,1,5,8,2,3]
                   arrayNotSorted[b] = temp; // [1,4,5,8,2,3]
               }
           }
        }
        return arrayNotSorted;
    }
}






