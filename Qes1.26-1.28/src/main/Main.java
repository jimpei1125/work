package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import animal.Animal;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");

		String input = sc.nextLine();// コンソールから一行読み込む
		String[] animalData = input.split(",");//動物ごとのデータを分割して配列に格納

		//学名、動物名を紐付けするMapを作成する
		Map<String, String> scientificNames = new HashMap<>();
		scientificNames.put("ライオン", "パンテラ レオ");
		scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
		scientificNames.put("チンパンジー", "パン・トゥログロディテス");
		scientificNames.put("シマウマ", "チャップマンシマウマ");
		scientificNames.put("インコ", "不明");

		// animalData配列の各要素を処理
		for (String data : animalData) {
			String[] parts = data.split(":");//コロンで分割
			String name = parts[0];
			double length = Double.parseDouble(parts[1]);
			int speed = Integer.parseInt(parts[2]);
			String scName = scientificNames.getOrDefault(name, "不明"); // 学名を取得。なければ不明にする。
			Animal animal = new Animal(name, length, speed, scName);//Animalオブジェクトを生成
			animal.printInfo();
		} 
		sc.close();// Scannerを閉じる
	}
}
