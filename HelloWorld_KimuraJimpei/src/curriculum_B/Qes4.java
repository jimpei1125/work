package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// 掛ける数
		for (int i = 1; i <= 9; i++) {
			// 掛けられる数
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%02d * %02d = %02d", i, j, i * j);//%書式文字列、0埋める文字、2桁数、d値の型(整数)

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
