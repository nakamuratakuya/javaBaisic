package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	 int run() {

		// ★ 1～15のランダムな値を取得して、変数numberに代入してください
		 this.gasoline--;

		 int limitNumber = 15;
		 int random = new java.util.Random().nextInt(limitNumber)+1;

 		 if(this.gasoline < 0) {
			 return -1;
		 }

		 return random;



	 }
}
