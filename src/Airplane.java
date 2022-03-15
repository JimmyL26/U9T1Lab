public class Airplane extends Vehicle{
    int wingCount;

    public Airplane(String name, int wheels, int wingCount)
    {
        super(name, wheels);
        this.wingCount = wingCount;
    }

    public int getWingCount()
    {
        return wingCount;
    }

    public void takeOff()
    {
        System.out.println("Preparing for take off!");
    }
}
