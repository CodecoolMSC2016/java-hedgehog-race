import java.util.*; 

public class Horse
{
	String name;	
	public Horse(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public static HashMap<String, Integer> horseFrequency() throws Exception
	{
		HashMap<String, Integer> horseMap = new HashMap<String, Integer>();
		for(Horse i: Simulation.getHorses())
		{	
			String horseName = i.getName();
			int freq = Collections.frequency(Simulation.load(), horseName);
			horseMap.put(i.getName(), freq);
		}
		return horseMap;	
}
}

