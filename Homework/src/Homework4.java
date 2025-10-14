import java.util.Scanner;

public class Homework4 {

    // 재귀 호출을 이용한 GCD 함수
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }

    // 반복문을 이용한 GCD 함수
    public static int gcdIterative(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 입력된 두 수의 최대공약수 계산
        int result = gcd(a, b);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");
        scanner.close();
    }
}