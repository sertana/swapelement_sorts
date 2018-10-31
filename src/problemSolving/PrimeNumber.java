package problemSolving;

import java.sql.SQLOutput;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int j = 2; j<=10;
        j++){
            boolean flag = false;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(j + " is prime");
            else
                System.out.println(j + " is not prime");

        }
    }
}
