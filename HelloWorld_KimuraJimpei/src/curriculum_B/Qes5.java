package curriculum_B;

public class Qes5 {
	
	/*問題文
	 * 001 * 001 = 001 || 001 * 002 = 002 || … 020 * 009 = 180 のように出力
	 * Qes4の改変でOK
	 */

	public static void main(String[] args) {
		// 掛ける数
		for (int i = 1; i <= 20; i++) {
			// 掛けられる数
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%03d * %03d = %03d", i, j, i * j);//%書式文字列、0埋める文字、3桁数、d値の型(整数)

				// jが9ではない場合「 || 」を付ける
				if (j != 9) {
					System.out.print(" || ");
				}
			}
			//改行
			System.out.println();
		}
	}
}
