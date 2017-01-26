import java.util.*;

public class Main
{	
	public static List<Simulation> sims = new ArrayList<Simulation>();
	
	public static void main(String[] args)throws Exception
	{
				
		Logger.log("welcome");
		Logger.log("money");
		Logger.log("horse");
	}
	

	public static void generateSimulation(int round) throws Exception
		{
//  Not returns a Simulation instance that contains the simulation result
		for(int i = 1; i<= round; i++)
		{
			Simulation sim = new Simulation();
			sim.generateData();
			sims.add(sim); 
		}
	}

}
