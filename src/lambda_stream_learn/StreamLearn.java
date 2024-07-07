package lambda_stream_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLearn {
	public static void main(String[] args) {
		// 컬렉션에서 Stream 생성
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Stream<Integer> stream = numbers.stream();

		// 배열에서 Stream 생성
		int[] array = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(array);

		// 직접 Stream 생성
		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

		// 필터: 조건에 맞는 것만 포함한다.
		numbers.stream() // 아래와 같이 개행
			.filter(integer -> integer % 2 == 0)
			.forEach(integer -> System.out.println(integer)); // 람다를 메서드 참조로:.forEach(System.out::println);
		// 매핑: 전부 *2한 값으로 바뀐다.
		List<Integer> collect = numbers.stream().map(integer -> integer * 2).collect(Collectors.toList());
		for (int i : collect) {
			System.out.println(i);
		}
		// 기본적으로 오름차순 정렬
		numbers.stream().sorted().forEach(integer -> System.out.println(integer));

		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

		// 가독성 위해 연산자 앞에서 개행하기도 함
		numbers.stream()
			.forEach(num -> System.out.println(num));

		// collect(): Stream의 요소를 수집하여 컬렉션이나 다른 형태로 변환
		List<Integer> squaredNumbers = numbers.stream()
			.map(num -> num * num)
			.collect(Collectors.toList());

		// reduce(): Stream의 요소를 결합하여 하나의 값으로 만든다.
		int sum = numbers.stream()
			.reduce(0, (a, b) -> a + b);
	}
}