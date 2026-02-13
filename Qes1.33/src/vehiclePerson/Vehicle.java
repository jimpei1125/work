package vehiclePerson;

public class Vehicle {
	private String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}

/*問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
 * 
 *
*問題2：CarクラスとBicycleクラスを作成しましょう。
*
*問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
*
*問題4：MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、
*Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。
*Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
*
*問題5：セットできたら、ownerをコンソールに出力してください。
*
*問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）

問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。

問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。

問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
*/