import java.util.Scanner;
import java.util.ArrayList;

/**
 * 학생 정보를 저장하는 클래스
 * 학번(studentId), 이름(name), 전공(major), 전화번호(phoneNumber) 속성을 가집니다.
 */
class Student {
    // 멤버 변수 (속성)
    private long studentId;      // 학번
    private String name;         // 이름
    private String major;        // 전공
    private long phoneNumber;    // 전화번호

    // Getter 메소드
    public long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    // Setter 메소드
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

/**
 * Homework2 클래스는 프로그램의 주 실행 지점입니다.
 * 3명의 학생 정보를 입력받아 Student 객체 리스트에 저장하고,
 * 입력이 완료되면 모든 학생 정보를 형식에 맞게 출력합니다.
 */
public class Homework2 {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        // Student 객체를 저장할 ArrayList 생성
        ArrayList<Student> studentList = new ArrayList<>();

        // 3명의 학생 정보를 입력받기 위한 반복문
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String inputLine = scanner.nextLine(); // 한 줄 전체를 문자열로 읽음
            String[] info = inputLine.split(" "); // 띄어쓰기를 기준으로 문자열 분리

            // 새로운 Student 객체 생성
            Student student = new Student();

            // 분리된 정보를 파싱하여 Student 객체에 저장
            student.setStudentId(Long.parseLong(info[0])); // 학번
            student.setName(info[1]);                      // 이름
            student.setMajor(info[2]);                     // 전공
            student.setPhoneNumber(Long.parseLong(info[3])); // 전화번호

            // 생성된 학생 객체를 리스트에 추가
            studentList.add(student);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        // 순서를 나타내기 위한 문자열 배열
        String[] ordinals = {"첫번째", "두번째", "세번째"};

        // 리스트에 저장된 모든 학생 정보를 출력하기 위한 반복문
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);

            // 전화번호를 '010-xxxx-xxxx' 형식으로 변환
            // 1. long 타입의 전화번호 앞에 '0'을 붙여 문자열로 만듦
            String phoneStr = "0" + student.getPhoneNumber();
            // 2. substring을 이용해 하이픈(-)을 삽입하여 최종 형식 생성
            String formattedPhone = phoneStr.substring(0, 3) + "-" +
                    phoneStr.substring(3, 7) + "-" +
                    phoneStr.substring(7);

            // 최종 결과 출력
            System.out.println(ordinals[i] + " 학생: " +
                    student.getStudentId() + " " +
                    student.getName() + " " +
                    student.getMajor() + " " +
                    formattedPhone);
        }

        // Scanner 리소스 정리
        scanner.close();
    }
}