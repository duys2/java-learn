package collection_learn.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLearn {
	public static void main(String[] args) {
		// String 타입의 Queue 객체 생성
		Queue<String> stringQueue = new LinkedList<>();

		// 삽입
		// add()는 삽입 시 큐의 용량을 IllegalStateException을 발생하고, offer()는 false를 반환한다.
		stringQueue.add("Hello World!");
		stringQueue.offer("Python");
		stringQueue.offer("C");
		stringQueue.offer("Java");
		stringQueue.offer("C#");

		System.out.println(stringQueue.poll()); // 가져오고 삭제: Hello World! 출력
		System.out.println(stringQueue.peek()); // 가져오기만 하기: Python 출력
		System.out.println(stringQueue.poll()); // 가져오고 삭제: Python 출력

		for (String queueElement : stringQueue) {
			System.out.print(queueElement + " "); // 출력: C Java C#
		}
	}
}