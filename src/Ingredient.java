public abstract class Ingredient {
    protected int scoop;

    public int getScoop() {
        return scoop;
    }

    public void setScoop(int scoop) {
        this.scoop = scoop;
    }
    public Ingredient(int Scoop){
        setScoop(Scoop);
    }
}
