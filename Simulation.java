/* Contains the simulation data.
*  generateData(), writes one simulated round to a file. We recommend the CSV format.
*  load(), loads the content of an instance of a Simulation and returns it. */

public class Simulation
{
	

	public void generateData()
	{
		
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

