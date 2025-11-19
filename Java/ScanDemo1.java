
import java.util.Scanner;

public class ScanDemo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,x;
        float avg;
        System.out.println("Enter no. of integers:");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            sum = sum + x;        
        }
        avg = sum/n;
        System.out.println("Sum: "+sum+"\nAverage:"+avg);
        sc.close();
    }
}
