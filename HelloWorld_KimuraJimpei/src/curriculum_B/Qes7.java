package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scannerの初期化

		System.out.print("名前を入力してください: ");

		String input = scanner.nextLine(); // 1行分の文字列を入力

		System.out.println("入力された文字は「" + input + "」です");
		
		scanner.close(); // Scannerをクローズ

	}

}
