package thread_learn;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		Thread extendThread = new ExtendThread();
		// RunnableThread runnableThread = new RunnableThread();
		Thread runnableTread = new Thread(new RunnableThread());

		extendThread.start(); // ExtendThread 동작
		// 체크드 예외: main 메서드에 throws InterruptedException를 붙여줘야 함
		Thread.sleep(1000); // 1초 지연
		runnableTread.start(); // RunnableThread 작동
	}
}