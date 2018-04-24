/*
 * PTra18_04.java
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

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(playerList);
		int g = 1;
		int d = 4;
		int m = 4;
		int f = 2;
		while (true) {
			for (int i = 0; i < playerList.size(); i++) {
				Player player = playerList.get(i);
				String position = player.getposition();
				switch (position) {
				case ("GK"): {
					if (g > 0) {
						System.out.println(playerList.get(i));
						g--;
					}
					break;
				}
				case ("DF"): {
					if (d > 0) {
						System.out.println(playerList.get(i));
						d--;
					}
					break;
				}
				case ("MF"): {
					if (m > 0) {
						System.out.println(playerList.get(i));
						m--;
					}
					break;
				}
				case ("FW"): {
					if (f > 0) {
						System.out.println(playerList.get(i));
						f--;
					}
					break;
				}
				}
			}
		}
	}
}
