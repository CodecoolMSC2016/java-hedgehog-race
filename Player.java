import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    private int money;
    private String name;

    public Player() {
        this.money = 1000;
        this.name = "player";
    }

    public Player(String name) {
        this.money = 1000;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int betMoney() {
        Logger betOption = new Logger("bet");
        Scanner betIn = new Scanner(System.in);
        while (betIn.nextInt() > money) {
            betOption.printError("lessMoney");
            betIn = new Scanner(System.in);
        }
        betOption.log(betIn.nextInt());
        money -= betIn.nextInt();
        return betIn.nextInt();
    }

    public String betName() {
        Logger betOption = new Logger("bethorse");
        betOption.log(betOption.getMessage());
        Scanner betIn = new Scanner(System.in);
        String horseName = betIn.next();
        ArrayList<String> names = Simulation.getHorseNamesAsStringArray();
        while(!names.contains(horseName))
        {
            betOption.printError("noHorse");
            betOption.log(betOption.getMessage());
            betIn = new Scanner(System.in);
            horseName = betIn.next();
        }
        return horseName;

    }
}
