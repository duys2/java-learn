package basic_learn;

public class ArrayLearn {
	public static void main(String[] args) {
		// Array
		double[] arr; // 배열 참조 변수 선언만 하기
		arr = new double[10]; // new 연산자로 크기가 10인 배열 생성 후 참조 변수에 할당

		double[] arr2 = new double[5]; // 참조 변수 선언과 동시에 생성

		int[] arr3 = {103, 1247, 26, 894651}; // 선언과 생성, 초기화까지 한번에 하기

		int[][] arr4 = new int[3][14]; // 행이 3개고 열이 14개인 2차원 배열(행렬) 생성

		// index로 접근하기
		arr[1] = 7.64;
		System.out.println(arr[1]); // 7.64
	}
}