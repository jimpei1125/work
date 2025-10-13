package selfIntroduce;

class Person {
	// インスタンスフィールドを定義
	String name; //名前
	int age; //年齢
	double height; //身長
	double weight; //体重
	static int count = 0; //合計人数用のフィールド

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //合計人数カウント
	}

	double bmi() {
		return weight / (height * height);
	}

	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
	}
}

/* フィールドとコンストラクタ
問題1：インスタンスフィールドを定義してください

フィールド：名データ型

name：string

age：int

height：double

問題2：コンストラクタを定義してください（下記それぞれの引数）

name,age,height

問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
----------------------------------------------------------------------------------------------------------------
インスタンスメソッド

問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）

問題5：Main.javaの引数にweightの60を入れてください

問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）

問題7：bmiメソッドでインスタンスのBMIを返すようにしてください

問題8：インスタンスメソッド「print」を定義してください（戻り値：void）

問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください

問題10：人数の合計を「合計○人です」と出力してください。
 */