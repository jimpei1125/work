package main;

import java.util.Scanner;

import status.PlayerStatus;

public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //(System.in)標準入力ストリーム
		System.out.print("あなたの名前を入力してください: ");
		String name = scanner.nextLine();

		PlayerStatus player = new PlayerStatus(name);

		System.out.println("こんにちは 「" + player.getName() + "」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp());
		System.out.println("MP：" + player.getMp());
		System.out.println("攻撃力：" + player.getAttack());
		System.out.println("素早さ：" + player.getSpeed());
		System.out.println("防御力：" + player.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
		scanner.close(); //スキャナーを閉じなくても良いが、マインドとして書いた方が良いかも
	}
}
