package animal;

public class Animal {
	// フィールド（インスタンス変数）外部からアクセスできないようにする
	private String name; // 名前
	private double length; // 体長(小数)
	private int speed; // 速度(整数)

	// コンストラクタ
	public Animal(String name, double length, int speed) {
		this.name = name; // thisでフィールドに代入、左がフィールド、右が引数
		this.length = length;
		this.speed = speed;
		
		//
	}

	// セッターメソッド
	public void setName(String name) { //名前
		this.name = name;
	}

	public void setLength(double length) { //体長
		this.length = length;
	}

	public void setSpeed(int speed) { //速度
		this.speed = speed;
	}

	// ゲッターメソッド
	public String getName() { //名前
		return this.name;
	}

	public double getLength() { //体長
		return this.length;
	}

	public int getSpeed() { //速度
		return this.speed;
	}
}

/*値を取得はgetter、設定はsetter
 * 
 * 
 */