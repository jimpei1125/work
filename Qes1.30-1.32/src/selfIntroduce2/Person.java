package selfIntroduce2;

class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	static int count = 0; //クラスフィールド count を定義
	//コンストラクタ

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //クラスフィールドcountに1を足す
	}

	public double bmi() {
		return Math.floor((this.weight / (this.height * this.height)) * 100) / 100.0;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
	}

	//クラスメソッド printCount を定義
	public static void printCount() {
		// 問題5：countを利用して出力
		System.out.println("合計" + count + "人です");
	}
}

/*
 * クラスフィールド
問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。


クラスメソッド
問題4：クラスメソッド「printCount」を定義してください（データ型：void）

問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください

問題6：クラスメソッド「printCount」を呼び出してください */
