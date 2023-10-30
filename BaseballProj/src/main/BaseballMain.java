package main;

import service.BaseballService;

public class BaseballMain {

	public static void main(String[] args) {
		BaseballService service = new BaseballService();
		int sel = 0;
		while (true) {
			sel = service.menu();
			if (sel == 0)
				break;
			switch (sel) {
			case 1:
				service.regTeam();
				break;
			case 2:
				service.teamInfo();
				break;
			case 3:
				service.teamListInfo();
				break;
			case 4:
				service.regPlayer();
				break;
			case 5:
				service.playerinfobyBacknum();
				break;
			case 6:
				service.playerinfobyNum();
				break;
			case 7:
				service.playerListInTeam();
				break;
			}

		}

	}

}
