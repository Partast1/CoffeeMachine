public class Machine {
    Filter filter = new Filter();
    CoffeeBean bean = new CoffeeBean(5);
    Tea tea = new Tea(5);
    WaterContainer Wc = new WaterContainer(10);
    CoffeeContainer Cc = new CoffeeContainer();


    private void StartBrewing()
    {
        Cc.RecieveIngredient(filter, bean);
        Cc.RecieveIngredient(filter, tea);

    }

}
