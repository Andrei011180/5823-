public class HotDrinkVendingMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
       
        return new HotDrink(name, volume, temperature);
    }
}

