// java.util 패키지의 모든 클래스 포함
// import java.util.*; // *은 '모든'이라는 뜻
// java.util 패키지의 Scanner 클래스만 포함

import java.util.ArrayList;
import java.util.Scanner; // 첫 번째, 클래스 import 하기

public class ScannerLearn {
	public static void main(String[] args) {
		/*
		 Scanner scanner = new Scanner(System.in); // 두 번째, Scanner 객체 생성
		 int num = scanner.nextInt(); // 세 번째, 메소드를 이용하여 입력 받기
		 scanner.close(); // 메모리 낭비 방지
		*/

		/* ---------------- 학생 성적 관리 시스템 ---------------- */

		Scanner scanner = new Scanner(System.in); // 객체 생성

		System.out.print("학생 수를 입력하세요: ");
		int students = scanner.nextInt(); // 정수 입력
		scanner.nextLine(); // nextInt() 사용으로 인한 개행문자 제거

		/* 입력 받은 값 할당할 변수 영역 */
		ArrayList<String> studentName = new ArrayList<>();
		ArrayList<Integer> koreanScore = new ArrayList<>();
		ArrayList<Integer> mathScore = new ArrayList<>();
		ArrayList<Integer> englishScore = new ArrayList<>();

		/* 총점, 평균, 등급 할당할 변수 영역 */
		ArrayList<Integer> totalScore = new ArrayList<>();
		ArrayList<Double> avgScore = new ArrayList<>();
		ArrayList<String> grade = new ArrayList<>();

		for (int i = 0; i < students; i++) {
			/* 입력 영역 */
			System.out.print("학생 이름: ");
			studentName.add(scanner.nextLine());
			System.out.print("국어 점수: ");
			koreanScore.add(scanner.nextInt());
			System.out.print("영어 점수: ");
			englishScore.add(scanner.nextInt());
			System.out.print("수학 점수: ");
			mathScore.add(scanner.nextInt());
			scanner.nextLine(); // nextInt() 사용으로 인한 개행문자 제거
			System.out.println();

			/* 계산 영역 */
			totalScore.add(koreanScore.get(i) + englishScore.get(i) + mathScore.get(i));
			avgScore.add((double)(koreanScore.get(i) + englishScore.get(i) + mathScore.get(i)) / 3);
			if (avgScore.get(i) >= 90) {
				grade.add("A");
			} else if (avgScore.get(i) >= 80) {
				grade.add("B");
			} else if (avgScore.get(i) >= 70) {
				grade.add("C");
			} else if (avgScore.get(i) >= 60) {
				grade.add("D");
			} else {
				grade.add("F");
			}
		}

		// 학생 별로 성적 출력하기!
		for (int i = 0; i < students; i++) {
			System.out.println("==== 학생 성적 정보 ====");
			System.out.println("이름: " + studentName.get(i));
			System.out.println("국어 점수: " + koreanScore.get(i));
			System.out.println("영어 점수: " + englishScore.get(i));
			System.out.println("수학 점수: " + mathScore.get(i));
			System.out.println("총점: " + totalScore.get(i));
			System.out.printf("평균: %.2f", avgScore.get(i)); // .2f는 소수점 이하는 2자리로 한다는 뜻
			System.out.println(); // 줄바꿈
			System.out.println("등급: " + grade.get(i));
			System.out.println("========================");
		}

		scanner.close(); // 종료
	}
}