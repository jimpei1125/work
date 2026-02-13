//サブクラス
package status;

import java.util.Random;

public class PlayerStatus extends Status {
	private String name;

	//入力名を受け取り、ランダムなステータスを設定する
	public PlayerStatus(String name) {
		super(rand(), rand(), rand(), rand(), rand()); // ランダム値
		this.name = name;
	}

	private static int rand() {
		return new Random().nextInt(1000) + 1; // 1〜1000の乱数
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
