import java.util.*;

public class Main
{	static int round;
	public static List<Simulation> sims = new ArrayList<Simulation>();

	public static void main(String[] args)
	{	
		try
		{
			Scanner inp = new Scanner(System.in);
			int inputNum = Integer.parseInt(inp.nextLine());
			round = inputNum;
			generateSimulation(round);
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map = Horse.horseFrequency();
			for(String i: map.keySet())
			{
				System.out.println(i +" "+ map.get(i));
			}
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
