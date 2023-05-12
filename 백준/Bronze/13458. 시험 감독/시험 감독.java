import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        long cnt = n;
        for (int i = 0; i < n; i++) {
            a[i] -= b;
            if (a[i] > 0) {
                cnt += a[i] / c;
                if (a[i] % c != 0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
