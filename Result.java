import java.util.*;

public class Result
{
	private String name;
	private List<String> bestbet;

	public Result(String name, List<String> bestbet)
	{
		this.name = name;
		this.bestbet = bestbet;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public static List<String> bestBet() throws Exception
	{
		List<String> result = new ArrayList<String>();
		HashMap<String, Integer> horsemap = new HashMap<String, Integer>();
		horsemap = Horse.horseFrequency();
		Integer simsum = 0;
		result.add("");
		result.add("0");
		for (Integer i:horsemap.values())
		{
			if (Integer.parseInt(result.get(1)) < i)
			{
				result.set(1,Integer.toString(i));
			}
			simsum += i;
		}
		int maxwon = Integer.parseInt(result.get(1));
		Integer onepercent = simsum/100;
		result.set(1,Integer.toString(maxwon/onepercent));
		for (Map.Entry<String, Integer> entry : horsemap.entrySet())
		{
            if (entry.getValue().equals(maxwon)) 
			{
                result.set(0,entry.getKey());
			}
		}
		return result;
	}
}
