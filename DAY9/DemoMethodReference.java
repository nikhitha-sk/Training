// package DAY9;
import java.util.*;

class Product{
    String itemName;
    int price;

    Product(String itemName,int price){
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class DemoMethodReference {
    public static void main(String[] args){
        List<String> skills = Arrays.asList(
            "Spring","Django","Cypress","Jinga","activeMQ"
        );
        // skills.forEach(skill -> System.out.println(skill));
        skills.sort(String::compareToIgnoreCase);
        skills.forEach(System.out::println);

    }

    public static void pojoRefer(){
        List<Product> items = Arrays.asList(
        new Product("SSD",5600),
        new Product("pendrive",800)  
        );

        items.forEach(System.out::println);
        items.sort(Comparator.comparing(Product::getItemName));
        items.forEach(System.out::println);
    }
}
