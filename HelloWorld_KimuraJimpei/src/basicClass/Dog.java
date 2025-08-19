package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String animalName = null;

	// Q2：フィールドに動物の数の変数を定義してください。
	private int animalCount = 0;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.animalName = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int animalCount) {
		this.animalCount = animalCount;
	}

	//ゲッターメソッド
	public String getAnimalName() {
		return animalName;
	}

	public int getAnimalCount() {
		return animalCount;
	}
}
