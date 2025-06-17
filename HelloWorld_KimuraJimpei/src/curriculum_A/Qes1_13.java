package curriculum_A;

public class Qes1_13 {
	/*																																	
																		
	〜〜〜ここまで完了で「1.6 変数②」にチェック〜〜〜																	
																		
																		
																		
																		
																		
	〜〜〜ここまで完了で「1.7.型変換」にチェック〜〜〜																	
																		
																		
																		
	〜〜〜ここまで完了で「1.8.真偽値と条件式」にチェック〜〜〜		*/

	public static void main(String[] args) {

		/*1																		
			下記9個をローカル変数として宣言のみしてください																	
			・バイト型・短整数型・整数型・長整数型																	
			・単精度浮動小数点数型・倍精度浮動小数点数型																	
			・文字型・文字列型																	
			・ブーリアン型*/

		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		String h;
		boolean i;

		/*2																		
		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください*/

		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		g = '0';
		h = "0";
		i = true;

		/*3																		
		初期化をしたそれぞれの変数に下記の値を代入してください																	
		・バイト型		10															
		・短整数型		100															
		・整数型		1000															
		・長整数型		10000															
		・単精度浮動小数点数型		9.5															
		・倍精度浮動小数点数型		10.5															
		・文字型		a															
		・文字列型		ハロー															
		・ブーリアン型		true */

		a = 10;
		b = 100;
		c = 1000;
		d = 10000;
		e = (float) 9.5;
		f = 10.5;
		g = 'a';
		h = "ハロー";
		i = true;

		/*4																		
		下記の通りにコンソール出力されるようにしてください																	
		上記で作成した変数を必ず使用すること																	
		11110		11110															
		20		20															
		a ハロー true		a ハロー true															
		11130		11130	数字を全て足す														
		10000000000		10000000000	小数点以外の数字を全てかける
		0.105		0.105	10.5割る100をする														
		-90		-90	10引く100をする */

		System.out.println(a + b + c + d);
		System.out.println(a + a);
		System.out.println(g + h + i);
		System.out.println(a + b + c + d + e + f);
		System.out.println(a * b * c * d);
		System.out.println(f / b);
		System.out.println(a - b);

		/*5																		
		次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。																	
		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		　String num="20";																	
		　int num1=23;																	
		　System.out.println("ハローJAVA"+(num+num1));*/
		String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

		/*6																		
		『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください	
		ローカル変数に代入し○○に入れてください																	
		『山田太郎 18歳 170.5cm 62.2kg 寿司』																	
																			
		↓↓format↓↓																	
		「初めまして○○です」																	
		「年齢は○○歳です」																	
		「身長は○○cmです」																	
		「体重は○○kgです」																	
		「好きな食べ物は○○です」*/

		//変数宣言
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favfood = "寿司";

		//記述
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favfood + "です");

		/* 7																		
		6で作成した自己紹介に続いてBMIが出力されるようにしてください																	
		「BMIは○○です」																	
		ただし計算は数値を直書きせず、全て変数を使ってすること */

		System.out.println("BMIは" + weight / ((height / 100) * (height / 100)) + "です");

		/*〜〜〜ここまで完了で「1.5 変数①」にチェック〜〜〜																	
																		
		8																		
		6で宣言した変数に再代入し下記の通りコンソールに出力してください																	
		　初めまして鈴木一郎です																	
		　年齢は24歳です																	
		　身長168.5cmです																	
		　体重は64.2kgです																	
		　好きな食べ物はオムライスです																	
		　BMIは22.6です */

		//変数再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favfood = "オムライス";

		//記述
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favfood + "です");
		System.out.println("BMIは" + weight / ((height / 100) * (height / 100)) + "です");

		/*
		9																		
		8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください																	
		　初めまして鈴木一郎です																	
		　年齢は48歳です																	
		　身長337.0cmです																	
		　体重は128.4kgです																	
		　好きな食べ物はオムライスです																	
		　BMIは11.31です */

		//記述
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + (age * 2) + "歳です");
		System.out.println("身長は" + (height * 2) + "cmです");
		System.out.println("体重は" + (weight * 2) + "kgです");
		System.out.println("好きな食べ物は" + favfood + "です");
		System.out.println("BMIは" + (weight / ((height / 100) * (height / 100)) / 2) + "です");

		/* 10																		
		8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		*/

		System.out.println(age >= 25);

		/*
		11																		
		8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください*/

		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);

		System.out.println(ageStr + heightStr + weightStr);

		/* 12																		
		11で変換した【年齢・身長】を整数型に変換して出力してください*/

		double heightDou = Double.parseDouble(heightStr);
		int ageInt = Integer.parseInt(ageStr);
		int heightInt = (int) heightDou;

		System.out.println(ageInt);
		System.out.println(heightInt);

		/*13																		
		12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください																	
		ただしif文は使わないでください*/
		
		

		System.out.println(ageInt == 25 || heightInt >= 160);

	}

}
