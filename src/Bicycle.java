public class Bicycle extends Vehicle{
    int gearCount;

    public Bicycle(String name, int wheels, int gearCount)
    {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public int getGearCount()
    {
        return gearCount;
    }

    public void ringBell()
    {
        System.out.println("Ding ding! Bell has been rung!");
    }
}
