public class SkunkDice extends Dice
{
	
	public SkunkDice()
	{
	}

	public boolean isDoubleSkunk()
	{
		
		return getDie1().getLastRoll() == 1 && getDie2().getLastRoll() == 1;
	}
	
	
}