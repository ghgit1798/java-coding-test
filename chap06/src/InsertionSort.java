import java.util.Scanner;

// straight insertionSort 장점 : 이미 정렬이 되었거나, 정렬된 상태에 가까울수록 매우 빠름
// straight insertionSort 단점 : 삽입할 곳이 멀리 떨어지면 이동(대입) 횟수가 많음

public class InsertionSort {
    // 단순 삽입 정렬
    static void insertionSort(int[] a, int n) {
        for(int i=1; i<n; i++) {
            int j;
            int tmp = a[i];
            for(j=i; j>0 && a[j-1]>tmp; j--)
                a[j] = a[j-1];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++) {
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<nx; i++)
            System.out.println("x["+i+"] = " + x[i]);
    }
}
