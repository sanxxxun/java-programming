import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 1. 몇 개의 정수를 입력받을 것인지 사용자에게 질문하고 입력받기
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = scanner.nextInt();

        // 2. 입력받은 개수(count)만큼의 크기를 가진 정수 배열 생성
        int[] numbers = new int[count];

        // 3. 배열에 저장할 정수들을 사용자에게 요청
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt(); // 공백으로 구분된 정수를 차례로 배열에 저장
        }

        // 4. 최소값과 최대값을 저장할 변수 초기화 (힌트에 따라 배열의 첫 번째 값으로 설정)
        int max = numbers[0];
        int min = numbers[0];

        // 5. 배열의 두 번째 요소부터 마지막 요소까지 반복하면서 최대/최소값 찾기
        // (i=1부터 시작하는 이유는 첫 번째 값은 이미 max, min에 들어가 있기 때문)
        for (int i = 1; i < count; i++) {
            // 현재 최대값(max)보다 배열의 요소가 더 크면, 그 값을 새로운 최대값으로 갱신
            if (numbers[i] > max) {
                max = numbers[i];
            }
            // 현재 최소값(min)보다 배열의 요소가 더 작으면, 그 값을 새로운 최소값으로 갱신
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 6. 최종 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        // Scanner 객체 리소스 정리
        scanner.close();
    }
}