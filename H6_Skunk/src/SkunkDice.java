
public class SkunkDice extends Dice
{
	//Making sure getLastRoll is calling from class Dice
	Dice dice;
	
	public SkunkDice()
	{
	}

	public int isDoubleSkunk()
	{
		
		return getLastRoll();
	}
	
	
}