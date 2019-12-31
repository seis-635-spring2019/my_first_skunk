public class Player
{
	private int rollScore;
	private int turnScore;
	private int roundScore;
	private int gameScore; // for now, same as roundScore
	private int numberChips;

	public Player()
	{
		this.rollScore = 0;
		this.turnScore = 0;
		this.roundScore = 0;
		this.gameScore = 0;
		this.numberChips = 50; // for now
	}

	public Player(int startingChipsPerPlayer)
	{
		this();
		this.numberChips = startingChipsPerPlayer;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	}

	public void addToRollScore(int lastTotal)
	{
		rollScore += lastTotal;
	}

	void setRollScore(int newRollScore)
	{
		this.rollScore = newRollScore;
	}

	int getRollScore()
	{
		return this.rollScore;
	}

	int getNumberChips()
	{
		return this.numberChips;
	}

	void setNumberChips(int newChips)
	{
		this.numberChips = newChips;
	}

	void setTurnScore(int newScore)
	{
		this.turnScore = newScore;
	}

	int getTurnScore()
	{
		return this.turnScore;
	}

	public String getName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	void setRoundScore(int i)
	{
		this.roundScore = i;
	}

	int getRoundScore()
	{
		return this.roundScore;
	}

}