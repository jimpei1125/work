package curriculum_B;
//----------------------問題文----------------------------------------------------

import java.util.Random;

//入力した商品の残り台数が出力されるシステムを下記の条件で作成してください

/*・拡張for文・Switch文・条件演算子を使用すること ※普通のif文は使用不可
・Switch文内でテレビとディスプレイは続けて書くようにしてください、
条件演算子で出力される値を変更してください

・テレビとディスプレイは同じ商品扱いとし、
ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 

・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません

・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません

・入力された値は「、」区切りで指定してください

・そのほかの値が入力された場合下記を出力されるようにしてください

・『受け取った値』は指定の商品ではありません

・残り台数は0〜11までのランダムな値が出力されるようにしてください

入力例↓↓
パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品

出力例↓↓
パソコンの残り台数は8台です
冷蔵庫の残り台数は7台です
扇風機の残り台数は7台です
加湿器の残り台数は3台です
テレビの残り台数は9台です
ディスプレイの残り台数は2台です
『 その他商品 』は指定の商品ではありません
 */

//インポート文
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //スキャナーの初期化
		Random rand = new Random();

		System.out.println("商品名を「、」区切りで入力してください：");
		String input = scanner.nextLine();

		// 全角 、で区切って配列に変換
		String[] products = input.split("、");

		for (String product : products) {

			String name = product.trim();//スペース除去
			int stock = rand.nextInt(12); // 0〜11の乱数
			
			//

			switch (name) {
			case "テレビ":
			case "ディスプレイ":
				// テレビとディスプレイは同じ処理、stockを使い分ける
				int tvStock = rand.nextInt(12); // 再度乱数を取得
				int displayStock = 11 - rand.nextInt(12); // 0〜11引く
				//条件演算子 テレビである場合はtvStock、
				String result = name.equals("テレビ") ? tvStock + "台です" : displayStock + "台です";
				System.out.println(name + "の残り台数は" + result);
				break;
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(name + "の残り台数は" + stock + "台です");
				break;
			default:
				System.out.println("『 " + name + " 』は指定の商品ではありません");
			}
		}

		scanner.close(); //スキャナーを閉じる
	}
}

/*switch 文内で case "テレビ": case "ディスプレイ": によってまとめ処理。

テレビとディスプレイは処理は同じだけど、三項演算子でそれぞれ stock 値を切り替えて出力。

条件演算子（三項演算子）を String result = name.equals("テレビ") ? ... : ...; で使用。

入力の文字列は全角「、」で区切る前提。*/