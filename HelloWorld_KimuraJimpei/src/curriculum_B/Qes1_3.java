package curriculum_B;

//インポート文
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //スキャナーの初期化

		String userName = ""; // ユーザー名を格納

		// ユーザー名の入力
		while (true) { // 繰り返し処理 
			System.out.print("名前を入力してください: ");
			String input = scanner.nextLine();

			if (input == null || input.length() == 0) {
				System.out.println("名前を入力してください");
			} else if (input.length() > 10) { // 10字以下かチェック
				System.out.println("名前を10文字以内にしてください");
			} else if (!input.matches("^[a-zA-Z0-9]+$")) { //半角英数字チェック !は論理否定
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				userName = input;
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				break;
			}
		}

		// じゃんけんシステム開始
		String[] hands = { "グー", "チョキ", "パー" };//グーから0、1、2とカウント 配列宣言
		Random rand = new Random(); //Randomクラス、乱数を生成 初期化
		int count = 0; // じゃんけん合計回数

		while (true) {
			System.out.print("0:グー, 1:チョキ, 2:パー から選んで番号を入力してください: ");
			int userHand;
			try { // try-catch文 例外が発生しうる処理
				userHand = Integer.parseInt(scanner.nextLine()); //文字列を取得し整数に変換
				if (userHand < 0 || userHand > 2) { //0より小さい、もしくは2より大きい場合
					System.out.println("0～2の数字を入力してください");
					continue; //最初に戻る 番号入力
				}
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください");
				continue; //最初に戻る 番号入力
			}

			int cpuHand = rand.nextInt(3); //0, 1, 2のいずれかをランダムに生成し、変数cpuhandに代入
			count++; //じゃんけん試行回数+1

			System.out.println(userName + "の手は「" + hands[userHand] + "」");
			System.out.println("相手の手は「" + hands[cpuHand] + "」");

			// 勝敗判定

			// もしも出した手、数字が一緒ならばあいこ処理
			if (userHand == cpuHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
				// 勝った場合
			} else if ((userHand == 0 && cpuHand == 1) || (userHand == 1 && cpuHand == 2)
					|| (userHand == 2 && cpuHand == 0)) {
				System.out.println("やるやん。次は俺にリベンジさせて");
				break;
			} else {
				// switch文で負けた手ごとのメッセージ
				switch (cpuHand) {
				case 0: //グーで負けたとき
					System.out.println("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！");
					break;
				case 1: //チョキで負けたとき
					System.out.println("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
					break;
				case 2: //パーで負けたとき
					System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
					break;
				}
			}
		}

		System.out.println("勝つまでにかかった合計回数は" + count + "回です");

		scanner.close();
	}
}
