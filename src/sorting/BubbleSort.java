package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {8, 3,9,0,2,1};
        for (int i=0; i<array.length; i++){
            for(int j=1; j<array.length-i; j++){
                if (array[j-1] > array[j]) {
                    int bigNum = array[j-1];
                    array[j-1]=array[j];
                    array[j]= bigNum;
                }
            }

        }
        for(int n=0; n<array.length; n++){
            System.out.print(array[n] +" ");
        }
    }
}
