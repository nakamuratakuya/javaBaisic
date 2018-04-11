package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

			Car car1 = new Car();
			car1.serialNo = 1;
			car1.color    = "ブラック";
			car1.gasoline = 3;

			Car car2 = new Car();
			car2.serialNo = 2;
			car2.color    = "マットブラック";
			car2.gasoline = 3;

			Car car3 = new Car();
			car3.serialNo = 3;
			car3.color    = "メタリックブラック";
			car3.gasoline = 3;

			Car[] cars = {car1,car2,car3};

			final int distance = 15;


		for (int j = 0 ;j < cars.length; j++) {
			int sum = 0;
			int n = 0;
			while (true) {
				n++;

				    int i = cars[j].run();
				    sum += i;
				    System.out.println(sum);


				    int x = cars[j].gasoline;
				    	if(i == -1){
				    		System.out.println(cars[j].color+"は目的地に到達できませんでした。");
				    			break;
				    	}
				    	if (distance < sum) {
				    		System.out.println(cars[j].color+"は目的地までに"+n+"時間かかりました。残りのガソリンは、"+x+"ℓです。");
				    			break;
				    	}

			}
		}
	}
}
