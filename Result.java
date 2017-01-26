import java.util.*;

public class Result
{
    private static Integer simsum = 0;
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
        simsum = 0;
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
	public HashMap<String, Double> getAllWinPercentsForGame() throws Exception
    {
        HashMap<String, Double> winStats = new HashMap<>();
        HashMap<String, Integer> horseMap = Horse.horseFrequency();
        int todouble = simsum;
        double toDouble = todouble;
        Double onepercent = toDouble/100;
        for (Map.Entry<String, Integer> entry : horseMap.entrySet())
        {
            winStats.put(entry.getKey(), (entry.getValue()/onepercent));
        }

        return winStats;
    }

    public Map<String, Double> getPercentagesForHorses(HashMap<String, Double> winStats) {
        Map<String, Double> sortedMap = new LinkedHashMap<>();
        winStats.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }
    public LinkedHashMap<String, Double> getOddsForHorses(Map<String, Double> sortedMap)
    {

        LinkedHashMap<String, Double> finalOddsMap = new LinkedHashMap<>();
        double baseOdds = 1.2;
        for(Map.Entry<String, Double> entry : sortedMap.entrySet())
        {
            finalOddsMap.put(entry.getKey(), baseOdds);
            baseOdds += 0.3;
        }
        return finalOddsMap;
    }
    public void decideBetResult(Player player, Map<String, Double> sortedMap, String userBet, int betAmount, String winner)
    {
    	if(userBet.equals(winner))
    	{
			for (Map.Entry<String, Double> entry : sortedMap.entrySet())
			{
				if (entry.getKey().equals(userBet)) player.betWon(betAmount, entry.getValue());
			}
		}
    }
}
