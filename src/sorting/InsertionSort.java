package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {6,5,9,3,4,2};
        for (int i =1; i<array.length; i++){
            int key = array[i];
            int j= i-1;
          while ((j>-1) && (key < array[j])) {
              int temp = array[j];
              array[j]= array[j+1];
              array[j+1] = temp;
              j--;
          }


        }
        for(int n=0; n<array.length; n++){
            System.out.print(array[n] +" ");
        }
        }

    }




