
public class Player {
    private int money;
    private String name;
    public Player()
    {
        this.money = 1000;
        this.name = "player";
    }
    public Player(String name)
    {
        this.money = 1000;
        this.name = name;
    }
    public int getMoney()
    {
        return money;
    }
    public String getName()
    {
        return name;
    }
    public void setMoney(int money)
    {
        this.money = money;
    }
    public void bet()
    {

    }

}
