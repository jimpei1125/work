package curriculum_New_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printMessage(String str, int num) {
		System.out.println("Hello " + str + " " + num);//スペース入れてます
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiplyAndPrint(int a, int b) {
		System.out.println(a * b);//掛け算メソッド作成
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int[] array) { //整数型の配列作成
		for (int num : array) { //拡張for文、順番に数字を取り出す処理
			System.out.println(num);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiplyAndPrint(double a, double b) {
		System.out.println(a + b);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	public static List<Integer> generateRandomNumbers(int count) { //List使用、配列の代替
		List<Integer> result = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < count; i++) { //引数countの数だけ繰り返す
			int num = rand.nextInt(100) + 1; //乱数格納用変数、+1で整数1を含め1～100の乱数を出す
			System.out.println(num); // 生成した値を出力
			result.add(num);
		}
		return result; //外側で使えるよう返す
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static void printAverage(List<Integer> list) {
		if (list == null || list.isEmpty()) { //空リストの場合、0.0を出して即終了させる
			System.out.println("平均値: 0.0");
			return;
		}
		double sum = 0; //小数点以下のためdouble
		for (int num : list) {
			sum += num;
		}
		double average = sum / list.size();
		System.out.println("平均値: " + average);
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean isAverageAtLeastFifty(double average) {
		boolean result = average >= 50.0; //50以上であるならばtrueを返す
		System.out.println(result); //結果出力
		return result;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		//Q1
		printMessage("JavaSE", 11);

		//Q2
		multiplyAndPrint(10, 5); //10と5を渡す場合

		//Q3
		int[] numbers = { 1, 2, 3, 4, 5 };
		printArray(numbers); // 配列を渡しメソッドを呼び出す

		//Q4
		multiplyAndPrint(2.5, 4.3); //2.5と4.3を渡す場合

		//Q5
		generateRandomNumbers(5); //5を渡す(5回繰り返す)

		//Q6
		List<Integer> nums = generateRandomNumbers(5); // 乱数5個生成
		printAverage(nums); // 平均値を出力

		//Q7
		List<Integer> randomNumbers = generateRandomNumbers(5); //乱数5個生成
		double average = randomNumbers.stream() // 平均値を計算
				.mapToInt(Integer::intValue) //intに型変換
				.average() //ストリーム要素の平均値
				.orElse(0.0); //空リストの場合、0.0と出す。

		isAverageAtLeastFifty(average);//メソッド呼び出し true or false

	}

}
