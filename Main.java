import java.util.*;

public class Main {
	static int round;
	public static List<Simulation> sims = new ArrayList<Simulation>();
	public static Player player = new Player();

	public static void main(String[] args)
	{	
		
		try
		{
			

		Logger.log("welcome");
		Logger.log("startMoney");
	// innentől while ciklus(amíg a player money-ja nem 0)
	
		Logger.log("horse");
		player.betName();
	
		Logger.log("bet");
		player.betMoney();
		Logger.log("money");
	// lefut a futam - Simulator run()
	// megvan a nyerő paci
	// ki kell számolni a játékos pénzét, (money + bet*paci_szorzó) vagy (money-bet)
	// ha elfogyott a pénze, while ciklus vége és kiírja hogy vége vagy valami...
		Logger.log("end");

		
		

		

		}
		catch (Exception e)
		{
			System.out.println("Wrong input");
		}	
	
	}


	public static void generateSimulation(int round) 
		{
		try
		{				
			//  Not returns a Simulation instance that contains the simulation result
			for(int i = 1; i<= round; i++)
			{
				Simulation sim = new Simulation();
				sim.generateData();
				sims.add(sim); 
			}
		}
		catch (Exception e)
		{
			throw e;
		}
		}


}
