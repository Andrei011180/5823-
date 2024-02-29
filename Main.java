public class Main {
    public static void main(String[] args) {
    
        HotDrink tea = new HotDrink("Tea", 200, 80);
        HotDrink coffee = new HotDrink("Coffee", 300, 85);

        
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

       
        HotDrink hotTea = vendingMachine.getProduct("Tea", 200, 80);
        HotDrink hotCoffee = vendingMachine.getProduct("Coffee", 300, 85);
        
    }
}

