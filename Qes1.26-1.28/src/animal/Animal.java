package animal;

//動物クラスを作成
public class Animal {
	private String name; //名前
	private double length; //体長
	private int speed; // 速度
	private String scientificName; //学名

	//コンストラクタ
	public Animal(String name, double length, int speed, String scientificName) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	//コンソールに出力するメソッド
	public void printInfo() {
		System.out.println("動物名：" + name);
		System.out.println("体長：" + length + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
		System.out.println();
	}

	//ゲッター
	public String getName() {
		return name;
	}
}
