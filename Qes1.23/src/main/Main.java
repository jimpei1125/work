package main;

import animal.Animal;

public class Main {
	public static void main(String[] args) {
		// Animalクラスのインスタンスを作成 コンストラクタに ライオン,2.1,80を渡す
		Animal lion = new Animal("ライオン", 2.1, 80);

		// ゲッターを使って出力 それぞれフィールド を返す
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}

