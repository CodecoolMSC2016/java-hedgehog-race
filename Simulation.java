/* Contains the simulation data.
*  generateData(), writes one simulated round to a file. We recommend the CSV format.
*  load(), loads the content of an instance of a Simulation and returns it. */

public class Simulation
{
	public String decideWinner()
	{
		String result;
		Random num = new Random();

		Horse[] horses = new Horse[5];	
		horses[0] = new Horse("Kincsem");
		horses[1] = new Horse("Csikócsőr");
		horses[2] = new Horse("Túladagolás");
		horses[3] = new Horse("Herbál");
		horses[4] = new Horse("Szmoki");
	
		int index = num.nextInt(horses.length);

		result = new Result(horses[index].getName());
	
		return result;
	}

	public void generateData()
	{	
		
		File file = new File("winnerHorses.csv");
		if(file.exists())
		{
			Writer pw = new FileWriter(file, true);
			StringBuilder sb = new StringBuilder();
			sb.append(decideWinner());
			
			pw.write(sb.toString());
			pw.close();
		}
		else
		{
			PrintWriter pw = new PrintWriter(new File(file));
			StringBuilder sb = new StringBuilder();
			sb.append(decideWinner());
			
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

