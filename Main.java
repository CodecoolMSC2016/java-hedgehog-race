import java.util.*;

public class Main {
	static int round;
	public static List<Simulation> sims = new ArrayList<Simulation>();
	public static Player player = new Player();

	public static void main(String[] args)
	{	
		
		try
		{
		generateSimulation(10000);
		Simulator sim = new Simulator(new Simulation(), new Logger());
		Result res = sim.run();
		HashMap<String, Double> winPercentMap = res.getAllWinPercentsForGame();
		Map<String, Double> winPercentSortedMap = res.getPercentagesForHorses(winPercentMap);
		Map<String, Double> oddsMap = res.getOddsForHorses(winPercentSortedMap);
		Logger log = new Logger();
		log.log("Winner of the Round is: ", (Simulation.decideWinnerWeighted(winPercentSortedMap)));


		Logger.log("welcome");
	    while(player.getMoney() > 0)
        {
			Logger.log("startMoney");
            Logger.log("horse");
            String betName = player.betName();

            Logger.log("bet");
            int bet = player.betMoney();
            Logger.log("money");
            String winner = (Simulation.decideWinnerWeighted(winPercentSortedMap));
            log.log("Winner of the Round is: ", winner);
            res.decideBetResult(player, oddsMap, betName, bet, winner);
        }
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
