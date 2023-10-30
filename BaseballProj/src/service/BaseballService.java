package service;

import java.util.List;
import java.util.Scanner;

import dao.PlayerDAO;
import dao.TeamDAO;
import dto.Player;
import dto.Team;

public class BaseballService {
	private PlayerDAO playerDAO;
	private TeamDAO teamDAO;

	// 팀 등록
	public void regTeam() {
		System.out.println("[팀등록]");
		System.out.println("팀명:");
		String teamName = sc.nextLine();
		System.out.println("연고지:");
		String local = sc.nextLine();
		teamDAO.insertTeam(new Team(null, teamName, local));

	}

	// 특정팀조회(팀명으로)
	public void teamInfo() {
		System.out.println("[팀조회]");
		System.out.println("팀명");
		String teamName = sc.nextLine();
		Team team = teamDAO.selectTeam(teamName);

	}

	// 팀목록조회
	public void teamListInfo() {
		System.out.println("[팀조회]");
		List<Team> teamList = teamDAO.selectTeamList();
		for (Team team : teamList) {
			System.out.println(team);
		}
	}

	// 선수등록
	public void regPlayer() {
		System.out.println("[선수등록]");
		System.out.println("선수명");
		String playerName = sc.nextLine();
		System.out.println("등번호");
		Integer backNum = Integer.parseInt(sc.nextLine());
		System.out.println("팀선택>>:"); // 팀선택():
		List<Team> teamList = teamDAO.selectTeamList();
		for (Team team : teamList) {
			System.out.println(team.shortString());
		}
		System.out.println("선택>>");
		Integer teamNum = Integer.parseInt(sc.nextLine());
		playerDAO.insertPlayer(new Player(null, playerName, backNum, teamNum, null));
	}

	// 특정선수조회(이름으로)
	public void playerinfobyName() {
		System.out.println("[선수조회(이름으로)]");
		System.out.println("선수명:");
		String playerName = sc.nextLine();
		List<Player> playerList = playerDAO.selectPlayerByName(playerName);
		for (Player player : playerList) {
			System.out.println(player);
		}

	}

	// 특정선수조회(등번호로)

	public void playerinfobyBacknum() {
		System.out.println("[선수조회(등번호)]");
		System.out.println("등번호:");
		Integer backNum = Integer.parseInt(sc.nextLine());
		List<Player> playerList = playerDAO.selectPlayerByBacknum(backNum);
		for (Player player : playerList) {
			System.out.println(player);
		}

	}

	// 특정선수조회(번호로 자동으로 할당)
	public void playerinfobyNum() {
		System.out.println("[선수조회(번호)]");
		System.out.println("번호:");
		Integer num = Integer.parseInt(sc.nextLine());
		Player player = playerDAO.selectPlayerByNum(num);
		System.out.println(player);
	}

	// 특정팀 소속 선수 목록 조회
	public void playerListInTeam() {
		System.out.println("[팀 소속 선수 목록 조회]");
		System.out.println("팀명을 입력해주세요: ");
		String teamName = sc.nextLine();
//		playerDAO에서 해당 팀 소속 선수 목록을 조회하는 메서드 호출
		List<Player> playerList = playerDAO.selectPlayerByTeam(teamName);
		for (Player player : playerList) {
			System.out.println(player);
		}

	}

	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("[야구 팀/선수 등록/조회]");
		System.out.println("0.종료");
		System.out.println("1.팀등록");
		System.out.println("2.특정팀조회");
		System.out.println("3.팀목록조회");
		System.out.println("----------");
		System.out.println("4.선수등록");
		System.out.println("5.특정선수조회(이름으로)");
		System.out.println("6.특정선수조회(등번호로)");
		System.out.println("7.특정선수조회(번호로)");
		System.out.println("8.특정팀선수목록조회");
		System.out.println("선택>>");
		return Integer.parseInt(sc.nextLine());
	}

}
