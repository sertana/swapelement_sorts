package problemSolving;

public class FibonacciSeries {
    public static void main(String[] args) {
        int next = 0;
        int prev = 1;
        for (int i=0; i<10; i++){
            System.out.print(next + " ");
            next = next + prev;
            prev = next - prev;
        }
    }
}
