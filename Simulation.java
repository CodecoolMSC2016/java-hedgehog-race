import java.io.*;
import java.util.*;

public class Simulation
{	
	String result;

	public String decideWinner()
	{
		Random num = new Random();

		Horse[] horses = new Horse[5];	
		horses[0] = new Horse("Kincsem");
		horses[1] = new Horse("Csikócsőr");
		horses[2] = new Horse("Túladagolás");
		horses[3] = new Horse("Herbál");
		horses[4] = new Horse("Szmoki");
	
		int index = num.nextInt(horses.length);

		result = horses[index].getName();
	
		return result;
	}

	public void generateData() throws Exception
	{	
		
		File file = new File("winnerHorses.csv");
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
	
	/*public void load()
	{
		
	
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
		{

			while ((line = br.readLine()) != null)
			{

		        // use comma as separator
		        String[] winnerHorses = line.split(cvsSplitBy);

		        System.out.println("horses....");

			}

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}*/
}

