import java.util.*;

public class Simulator
{
	private Simulation sim;
	private Logger log;
	public Simulator(Simulation simulation, Logger logger) throws Exception
	{
		this.sim = simulation;
		this.log = logger;
	}

	public Result run() throws Exception
	{
		List<String> result = Result.bestBet();
		String printMsg = "Name of the most succesful horse is: "+result.get(0);
		log.log("Safest strategy", printMsg);
		return new Result("meghalas", result);

	}

}
