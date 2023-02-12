import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        int i, n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        k = a[0];

        for (i = 0; i < n; i++) {
            if (a[i] - i != k) {

                while (k < a[i] - i) {
                    System.out.print(k + i + " ");
                    k++;

                }
            }

        }

    }
}