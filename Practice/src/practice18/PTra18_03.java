/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> playerList = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] splitline = line.split(",");
				Player player = new Player();
				player.setposition(splitline[0]);
				player.setname(splitline[1]);
				player.setcountry(splitline[2]);
				player.setteam(splitline[3]);

				playerList.add(player);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

	        ArrayList<String> player2 = new ArrayList<>();
	        Collections.addAll(player2, "レアル・マドリード", "バルセロナ");
	        playerList.removeAll(player2);

		for (Player p :playerList) {
			System.out.println(p);
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		// ★ 削除後のArrayListの中身を全件出力してください

	}
}
