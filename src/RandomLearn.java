import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomLearn {
	public static void main(String[] args) {
		/* 인스턴스 생성 방법 */
		Random random = new Random();
		// 아래의 경우 생성되는 난수들의 순서와 값이 예측 가능하므로 위처럼 하는 게 일반적이다
		Random random2 = new Random(100); // 시드값 부여

		/* 난수 시퀀스가 동일하고 동일하지 않은 것의 차이 비교해서 알아보기 */
		System.out.println(random.nextInt(10)); // 2, 3, 9
		System.out.println(random.nextInt(10)); // 1, 9, 6
		System.out.println(random.nextInt(10)); // 0, 2, 7
		System.out.println(); // 구분하기 위해 줄바꿈
		System.out.println(random2.nextInt(10)); // 5, 5, 5
		System.out.println(random2.nextInt(10)); // 0, 0, 0
		System.out.println(random2.nextInt(10)); // 4, 4, 4

		/* 1부터 100까지의 난수 10개의 합 구하기 */
		Random randomNum = new Random();

		int count = 10;
		int sum = 0;

		for (int i = 0; i < count; i++) {
			sum += randomNum.nextInt(100) + 1;
		}

		System.out.println("난수 10개의 합은 " + sum);

		/* 로또 번호 생성기 */
		Random rand = new Random();

		ArrayList<Integer> lottoNum = new ArrayList<>();

		while (lottoNum.size() < 6) {
			int number = rand.nextInt(45) + 1;

			if (!lottoNum.contains(number)) {
				lottoNum.add(number);
			}
		}

		Collections.sort(lottoNum); // 정렬

		System.out.println("로또 번호: " + lottoNum);
	}
}
