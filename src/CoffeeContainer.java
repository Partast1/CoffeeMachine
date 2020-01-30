public class CoffeeContainer {
    private int maximumScoops;


    public Ingredient RecieveIngredient(Filter filt,Ingredient ing){
        if (ing instanceof CoffeeBean){
            System.out.print("Coffee is brewing");

        }
        else if(ing instanceof Tea){
            System.out.print("Tea is brewing");
        }
        return ing;
    }
}
