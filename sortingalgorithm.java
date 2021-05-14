import java.util.*;

class InsertionSort{

   public static void main (String args[]){
      int [] array = {0,3, 4, 5, 7, 8, 1, 6};
      System.out.println("Old Array" + Arrays.toString(array));
      int [] newArray = insertionSort(array);
      System.out.println("New Array" + Arrays.toString(newArray));
   }
   
   public static int [] insertionSort (int[] array){
   
      for(int i = 1; i<array.length; i++){
         int key = array[i];
         int j = i-1;
         
         while (j>=0 && key<array[j]){
            //swap
            array[j+1] = array[j];
            j--;
         
         }
         
         array[j+1] = key; 
      }
      
      return array;
   
   }  

}