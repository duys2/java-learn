package collection_learn.stack_queue;

import java.util.Stack;

public class StackLearn {
	public static void main(String[] args) {
		// Integer 타입의 Stack 객체 생성
		Stack<Integer> integerStack = new Stack<>();

		// 삽입
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);

		System.out.println(integerStack.get(1)); // index 1의 객체 가져오기: 2 출력
		System.out.println(integerStack.peek()); // 맨 위 객체 가져오기: 5 출력
		System.out.println(integerStack.pop()); // 맨 위 객체 가져오고 삭제하기: 5 출력
		System.out.println(integerStack.peek()); // pop()으로 인해 맨 위 객체(5)가 삭제되어 4가 출력된다.

		for (Integer i : integerStack) {
			System.out.print(i + " "); // 1 2 3 4 출력
		}
	}
}