import java.util.*;

public class Main
{	
	public static List<Simulation> sims = new ArrayList<Simulation>();
	public static void main(String[] args)throws Exception
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map = Horse.horseFrequency();
		for(String i: map.keySet())
		{
			System.out.println(i + map.get(i));
		}	
	
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
