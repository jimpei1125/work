package process;

//インポート文 Java標準の日時クラス
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {

	// フィールド変数 メッセージ表示用に4つ
	private String greeting;
	private String sushiTaste;
	private String sushiType;
	private String dateTimeMessage;

	// コンストラクタ
	public Process() {
		// thisを使って初期化
		this.greeting = "こんにちは！ここは日本です！";
		this.sushiTaste = "この寿司はうまい";
		this.sushiType = "寿司は和食です";

		// 現在日時を取得
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.dateTimeMessage = "今の現在日時は" + now.format(formatter) + "です";
	}

	// メッセージを出力するメソッド
	public void printMessages() {
		System.out.println(this.greeting);
		System.out.println(this.sushiTaste);
		System.out.println(this.sushiType);
		System.out.println(this.dateTimeMessage);
	}
}