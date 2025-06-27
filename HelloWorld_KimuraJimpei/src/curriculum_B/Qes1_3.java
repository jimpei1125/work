package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scannerの初期化

		System.out.print("名前を入力してください: ");

		String input = scanner.nextLine(); // 1行分の文字列を入力
		
		// || 論理和 左辺か右辺のどちらかがtrueの場合にtrue
		if (input == null || input.length() == 0) { //名前がnull、0字以下　

			System.out.println("名前を入力してください");
		} else if (input.length() > 10) { //11字以上の場合
			System.out.println("名前を10文字以内にしてください");
		} else {
			System.out.println("ユーザー名「" + input + "」を登録しました");
		}

		scanner.close(); // Scannerをクローズ

	}

}
