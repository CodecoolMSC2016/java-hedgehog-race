import java.io.*;
import java.util.*;

public class Simulation
{	
	String result;
	
	public String decideWinner()
	{
		Random num = new Random();

		Horse[] horses = Simulation.getHorses();
	
		int index = num.nextInt(horses.length);

		result = horses[index].getName();
	
		return result;
	}

	public static String decideWinnerWeighted(Map<String, Double> sortedMap)
	{

		Random gen = new Random();
		String[] nameArr = new String[5];
		int winnerIndex = gen.nextInt(100);
		int i = 0;
		for(String name: sortedMap.keySet()) {
			nameArr[i] = name;
			i+= 1;

		}
		if(winnerIndex <= 30) return nameArr[0];
		else if(winnerIndex > 30 && winnerIndex <= 55) return nameArr[1];
		else if(winnerIndex > 55 && winnerIndex <= 75) return nameArr[2];
		else if(winnerIndex > 75 && winnerIndex <= 90) return nameArr[3];
		else if(winnerIndex > 90 && winnerIndex <= 100)return nameArr[4];
		else return null;
	}

	public static Horse[] getHorses()
	{
		Horse[] horses = new Horse[5];	
		horses[0] = new Horse("Kincsem");
		horses[1] = new Horse("Csikócsőr");
		horses[2] = new Horse("Túladagolás");
		horses[3] = new Horse("Herbál");
		horses[4] = new Horse("Szmoki");

		return horses;
	}

	public static ArrayList<String> getHorseNamesAsStringArray()
	{
		ArrayList<String> names = new ArrayList<>();
		for(Horse i: getHorses())
			{
				names.add(i.getName());
			}
		return names;
	}

	public void generateData()
	{	
		try
		{
			File file = new File("./winnerHorses.csv");
			if(file.exists())
			{
				Writer pw = new FileWriter(file, true);
				StringBuilder sb = new StringBuilder();
				sb.append(decideWinner());
				sb.append('\n');
			
				pw.write(sb.toString());
				pw.close();
			}
			else
			{
				Writer pw = new FileWriter(new File("winnerHorses.csv"));
				StringBuilder sb = new StringBuilder();
				sb.append(decideWinner());
				sb.append('\n');
			
				pw.write(sb.toString());
				pw.close();
		    	}
		}
		catch (Exception e)
		{
			
		}
	}
	
	public static List<String> load() throws Exception
	{
	  	
	 	File file = new File("winnerHorses.csv");
		BufferedReader reader = new BufferedReader(new FileReader("winnerHorses.csv"));
		List<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = reader.readLine()) != null)
		{
	    		lines.add(line);
	 	}       
	      	return lines;
		
	}
}

