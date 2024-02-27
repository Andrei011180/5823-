// Создаем класс ГорячийНапиток с дополнительным полем температура
class HotDrink {
    String name;
    int volume;
    int temperature;

    public HotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }
}

// Создаем интерфейс ТорговыйАвтомат
interface VendingMachine {
    HotDrink getProduct(String name, int volume, int temperature);
}

// Создаем класс ГорячихНапитковАвтомат, реализующий интерфейс ТорговыйАвтомат
class HotDrinkVendingMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        // Ваша логика обработки и выдачи продукта в соответствии с переданными параметрами
        return new HotDrink(name, volume, temperature);
    }
}

public class Main {
    public static void main(String[] args) {
        // Проинициализируем несколько ГорячихНапитков
        HotDrink tea = new HotDrink("Tea", 200, 80);
        HotDrink coffee = new HotDrink("Coffee", 300, 85);

        // Проинициализируем ГорячийНапитокАвтомат
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

         // Воспроизведем логику программы, вызвав метод getProduct
         HotDrink hotTea = vendingMachine.getProduct("Tea", 200, 80);
         HotDrink hotCoffee = vendingMachine.getProduct("Coffee", 300, 85);
         // Далее можно что-то сделать с полученными объектами HotDrink
     }
 }