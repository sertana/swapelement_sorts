package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {101,67,89,7,56,23};
        for (int i=0; i<array.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;


                }
            }
            int smallNum = array[index];
            array[index] = array[i];
            array[i] = smallNum;
        }



        for(int n=0; n<array.length; n++) {
            System.out.print(array[n]+" ");
        }

    }
}
