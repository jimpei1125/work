package curriculum_B;

//インポート文
import java.util.Scanner;

public class Qes7 {

	/*---------------------------------------------問題文---------------------------------------------------------
	 * N人の生徒の成績を管理するプログラムを下記条件で作成してください
	 * ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
	 * ・このプログラムの実行は必ず1回以上行われるようにしてください
	 * ・出力例を参考にプログラミングを作成してください
	 * 
	 *・入力、出力例
	 * ・生徒の人数を入力してください（2以上）: 2
	 * 1人目の『英語』の点数を入力してください :10
	 * 1人目の『数学』の点数を入力してください :10
	 * 1人目の『理科』の点数を入力してください :10
	 * 1人目の『社会』の点数を入力してください :10
	 * 2人目の『英語』の点数を入力してください :10
	 * 2人目の『数学』の点数を入力してください :10
	 * 2人目の『理科』の点数を入力してください :10
	 * 2人目の『社会』の点数を入力してください :10
	 * 
	 * 1人目の平均点は10.00点です。
	 * 2人目の平均点は10.00点です。
	 * 
	 * 英語の平均点は10.00点です。
	 * 数学の平均点は10.00点です。
	 * 理科の平均点は10.00点です。
	 * 社会の平均点は10.00点です。
	 * 全体の平均点は10.00点です。
	 * 
	 * 
	 ----------------------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //スキャナーの初期化

		int n; // n = 2になるまで処理を繰り返す

		//do-whileループを使って処理実行後に条件を確認
		do {
			System.out.println("生徒の人数を入力してください（2以上）：");
			n = scanner.nextInt();
		} while (n < 2); //入力数が2未満である場合、再度入力を促す

		//変数宣言
		int subjectCount = 4; //教科数(英語、数学、理科、社会)

		String[] subjects = { "英語", "数学", "理科", "社会" };

		/*多次元配列の宣言 データ型[][] 配列変数名
		 *多次元配列の作成 配列変数名 = new データ型[要素数][]
		 *まとめて行う場合は int[][] num = new int[2][];
		 */

		int[][] scores = new int[n][subjectCount]; //生徒数と教科数の二次元配列

		//ループ処理

		for (int i = 0; i < n; i++) { //生徒数分、繰り返す
			for (int j = 0; j < subjectCount; j++) { // 教科数分、繰り返す
				String result = String.format("%d人目の『%s』の点数を入力してください", i + 1, subjects[j]); //%書式文字列、d値の型(整数)、s値の型(文字)
				System.out.println(result);
				scores[i][j] = scanner.nextInt();
			}

		}

		//平均点算出
		for (int i = 0; i < n; i++) { //生徒人数
			int sum = 0;//生徒1の合計点数
			for (int j = 0; j < subjectCount; j++) { //教科数分
				sum += scores[i][j]; //合計値をsumに入れる
			}
			double avg = (double) sum / subjectCount; //合計値sumを教科数で割る
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, avg); //printfメソッドで省略,//小数点以下2桁表示
		}
		System.out.println(); //改行

		// 各教科の平均点および全体の平均点
		int totalSum = 0; //全生徒、全教科分の合計点
		for (int i = 0; i < subjectCount; i++) { //全ての教科分繰り返す
			int subjectSum = 0; //合計点
			for (int j = 0; j < n; j++) { //
				subjectSum += scores[j][i]; // subjectSumに点数を加算していく
			}
			//全体平均点
			double subjectAvg = (double) subjectSum / n; //各教科の平均点を算出 subjectSumを人数で割る
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[i], subjectAvg);
			totalSum += subjectSum; //最終的にtotalSumは全教科全生徒の合計点になる
		}
		double totalAvg = (double) totalSum / (n * subjectCount);//全生徒、全教科分の合計点totalSumを、(人数×教科数)で割る
		System.out.printf("全体の平均点は%.2f点です。\n", totalAvg);

		scanner.close();//スキャナーを閉じる

	}
}