public class SkunkApp
{

	private SkunkDomain skunkDomain;
	private int numberOfPlayers;
	private String[] playerNames;

	public SkunkApp()
	{
		SkunkUI skunkUI = new SkunkUI();
		skunkDomain = new SkunkDomain(skunkUI);
		this.numberOfPlayers = 0;
		this.playerNames = new String[20];

	}

	/**
	 * Runs the app within an event loop
	 * 
	 * @return
	 */
	private void run()
	{
		skunkDomain.run();
	}
	

	public static void main(String[] args)
	{
		new SkunkApp().run();
	}

}