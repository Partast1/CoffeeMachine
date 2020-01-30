import java.util.Scanner;
public class Machine {

    Filter filter;
    Bean bean;
    Tea tea;
    WaterContainer Wc;
    CoffeeContainer Cc = new CoffeeContainer();



    Scanner scan = new Scanner(System.in);


    public void BeverageSelection(){
        System.out.print("Select your warm beverage: 1. Coffee - 2. Tea - 3. Espresso");
        int switchInput = scan.nextInt();
    switch (switchInput)
    {
        case 1:
            System.out.print("Select cups of water");
            int watInput = scan.nextInt();
            Wc = new WaterContainer(watInput);
            System.out.print("Select scoops of coffee");
            int ingInput = scan.nextInt();
            bean = new Bean(ingInput);

            filter = new Filter();
            Ingredient ingcof = Cc.RecieveIngredient(filter, tea);
            Beverage cof = new Coffee((Bean) ingcof);
            break;

        case 2:
            System.out.print("Select cups of water");
            watInput = scan.nextInt();
            Wc = new WaterContainer(watInput);
            System.out.print("Select scoops of tea");
            ingInput = scan.nextInt();
            tea = new Tea(ingInput);
            filter = new Filter();
            Ingredient ingtea = Cc.RecieveIngredient(filter, tea);
            Beverage tea = new HotTea((Tea) ingtea);
            break;
        case 3:
            Wc = new WaterContainer(1);
            filter = new Filter();
            bean = new Bean(1);
            Ingredient ingesp = Cc.RecieveIngredient(filter, bean);
            Beverage Esp = new Espresso((Bean) ingesp);
            break;

    }
    }


}
