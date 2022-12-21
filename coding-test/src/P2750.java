import java.util.Scanner;
import java.util.Arrays; // Arrays와 ArrayList의 차이는?

public class P2750 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {    
            arr[i] = stdIn.nextInt();
        }

        // Selection sort
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int val : arr) {
            System.out.println(val);
        }
    }
}
