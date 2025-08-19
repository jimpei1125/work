package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String animalName = null; //メンバ変数、フィールド

	// Q2：フィールドに動物の数の変数を定義してください。
	private int animalCount = 0; //メンバ変数、フィールド

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.animalName = "犬"; //初期化
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int animalCount) {
		this.animalCount = animalCount;
	}

	//ゲッターメソッド 処理を書く publicにすることで、外から呼べる
	public String getAnimalName() { //名前
		return animalName;
	}

	public int getAnimalCount() { //数
		return animalCount;
	}
}
/*クラス＝設計図 オブジェクト＝実物

フィールド＝持っているデータ・状態

メソッド＝やりたいこと・操作

コンストラクタ＝作るときのお約束処理

mainメソッド＝プログラムのスタート

カプセル化＝データを勝手に書き換えられないように守る

API（今回なら日時クラス）を使って便利に日付を扱う
*/
