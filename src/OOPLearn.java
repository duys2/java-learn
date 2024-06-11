import java.util.Scanner;

public class OOPLearn {
	public static void main(String[] args) {
		Player player = new Player("Steve", 250, 10, 25);
		Wolf wolf = new Wolf("Angry Wolf", 100, 25, 45);

		player.say(); // 플레이어 말하기
		// player.attack(wolf); // 플레이어가 늑대를 공격
		// wolf.attack(player); // 늑대가 플레이어를 공격

		Scanner sc = new Scanner(System.in);

		while (player.getHp() > 0 && wolf.getHp() > 0) { // 둘 중 하나가 처치될 때까지 진행
			try { // try-catch 블록으로 예외 처리
				System.out.println(); // 가독성을 위한 줄바꿈
				System.out.println("1: 플레이어의 공격, 2: 늑대의 공격");
				System.out.print("원하는 동작을 선택하세요: ");

				int number = sc.nextInt();

				switch (number) {
					case 1:
						player.attack(wolf);
						break;
					case 2:
						wolf.attack(player);
						break;
					default:
						System.out.println("다시 선택해 주세요.");
						break;
				}
			} catch (Exception e) { // 예외 처리문
				System.out.println("유효한 값을 입력해 주세요.");
				sc.next();
			}
		}
		System.out.println(); // 가독성을 위한 줄바꿈
		System.out.print("종료! ");
		System.out.println((player.getHp() <= 0) ? "늑대" : "플레이어" + "의 승리!");

		sc.close();
	}
}

class Player {
	/* ---------------- 필드 (정보 은닉을 위해 private로 선언) ---------------- */
	private String name;
	private int hp;
	private int speed;
	private int power;

	/* ---------------- 생성자 ---------------- */
	public Player(String name, int hp, int speed, int power) {
		this.name = name;
		this.hp = hp;
		this.speed = speed;
		this.power = power;
	}

	/* ---------------- 메서드 ---------------- */
	public void say() {
		System.out.println("Hello Play World! I'm " + name + "!");
	}

	// 공격
	public void attack(Wolf wolf) {
		if (wolf != null) {
			wolf.setHp(wolf.getHp() - this.power);
			System.out.println("당신이 늑대를 공격합니다!");
			if (wolf.getHp() > 0) {
				System.out.println("늑대의 체력이 " + wolf.getHp() + " 남았습니다!");
			} else {
				System.out.println("늑대를 처치했습니다!");
			}
		}
	}

	/* ---------------- 접근자와 설정자 ---------------- */
	public int getHp() { // 접근자(getters)
		return hp;
	}

	public void setHp(int hp) { // 설정자(setters)
		this.hp = hp;
	}
}

class Wolf {
	/* ---------------- 필드 (정보 은닉을 위해 private로 선언) ---------------- */
	private String name;
	private int hp;
	private int speed;
	private int power;

	/* ---------------- 생성자 ---------------- */
	public Wolf(String name, int hp, int speed, int power) {
		this.name = name;
		this.hp = hp;
		this.speed = speed;
		this.power = power;
	}

	/* ---------------- 메서드 ---------------- */
	public void attack(Player player) {
		if (player != null) {
			player.setHp(player.getHp() - this.power);
			System.out.println("늑대가 당신을 공격합니다!");
			if (player.getHp() > 0) {
				System.out.println("당신의 체력이 " + player.getHp() + " 남았습니다!");
			} else {
				System.out.println("당신이 사망했습니다!");
			}
		}
	}

	/* ---------------- 접근자와 설정자 ---------------- */
	public int getHp() { // 접근자(getters)
		return hp;
	}

	public void setHp(int hp) { // 설정자(setters)
		this.hp = hp;
	}
}