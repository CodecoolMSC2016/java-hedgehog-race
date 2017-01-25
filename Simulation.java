/* Contains the simulation data.
*  generateData(), writes one simulated round to a file. We recommend the CSV format.
*  load(), loads the content of an instance of a Simulation and returns it. */

public class Simulation
{
	

	public void generateData()
	{	
		
		File file = new File("winnerHorses.csv");
		if(file.exists())
		{
			Writer pw = new FileWriter(file, true);
			StringBuilder sb = new StringBuilder();
			sb.append();
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("done!");
		}
		else
		{
			PrintWriter pw = new PrintWriter(new File(file));
			StringBuilder sb = new StringBuilder();
			sb.append("id");
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("done!");
	    	}
	}
	
	public void load()
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
	}
}

