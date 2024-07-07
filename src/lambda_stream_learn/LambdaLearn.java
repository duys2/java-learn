package lambda_stream_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaLearn {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		for (Integer number : numbers) { // 기존의 방식
			System.out.print(number + " "); // 모든 요소 출력
		}

		System.out.println();

		// e는 매개변수
		numbers.forEach(e -> System.out.print(e + " ")); // 모든 요소 출력

		System.out.println();

		numbers.forEach(e -> { // 짝수만 출력
			if (e % 2 == 0)
				System.out.print(e + " ");
		});
	}
}