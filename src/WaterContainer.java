public class WaterContainer {
    private int cupOfWater;
    private float maxWater;

    public int getCupOfWater() {
        return cupOfWater;
    }

    public void setCupOfWater(int cupOfWater) {
        this.cupOfWater = cupOfWater;
    }

    public WaterContainer(int water)
    {
        setCupOfWater(water);
    }

}
