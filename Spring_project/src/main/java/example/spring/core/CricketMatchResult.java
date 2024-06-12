package example.spring.core;

public class CricketMatchResult implements GreetingService {

	private String winningTeam;
	private String loseingTeam;
	private int winningMargin;
	private String winningType;

	public CricketMatchResult() {
		System.out.println("inside the CriketTeam Result ()");
	}

	public CricketMatchResult(String winingTeam, String loseingTeam, int winingMargin, String winingType) {

		System.out.println("inside the CriketTeam Result (String, String ,int, String)");
		this.winningTeam = winingTeam;
		this.loseingTeam = loseingTeam;
		this.winningMargin = winingMargin;
		this.winningType = winingType;
	}

	public CricketMatchResult(int winningMargin, String winningTeam, String loseingTeam, String winningType) {
		System.out.println("inside the CriketTeam Result (int, String, String , String)");
		this.winningMargin = winningMargin;
		this.winningTeam = winningTeam;
		this.loseingTeam = loseingTeam;
		this.winningType = winningType;
	}

	@Override
	public String sayGreeting() {
		String greetinmsg = " Heartist Congrulation To Team " + winningTeam 
				+ " for defeating team" + loseingTeam
				+ " by" + winningMargin + " " + winningType;
		return greetinmsg;
	}

	public String getWinningTeam() {
		return winningTeam;
	}

	public void setWinningTeam(String winingTeam) {
		System.out.println("setting wining team");
		this.winningTeam = winingTeam;
	}

	public String getLoseingTeam() {
		return loseingTeam;
	}

	public void setLoseingTeam(String loseingTeam) {
		this.loseingTeam = loseingTeam;
	}

	public int getWinningMargin() {
		return winningMargin;
	}

	public void setWinningMargin(int winingMargin) {
		this.winningMargin = winingMargin;
	}

	public String getWinningType() {
		return winningType;
	}

	public void setWinningType(String winingType) {
		this.winningType = winingType;
	}

	@Override
	public String toString() {
		return "CricketMatchResult [winingTeam=" + winningTeam + ", loseingTeam=" + loseingTeam + ", winingMargin="
				+ winningMargin + ", winingType=" + winningType + "]";
	}

}
