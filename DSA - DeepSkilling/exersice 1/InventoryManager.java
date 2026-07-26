import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added");
    }

    public void updateProduct(int id, int quantity, double price) {

        Product product = inventory.get(id);

        if(product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated");
        }
        else {
            System.out.println("Product Not Found");
        }

    }

    public void deleteProduct(int id) {

        if(inventory.remove(id) != null)
            System.out.println("Product Deleted");
        else
            System.out.println("Product Not Found");

    }

    public void displayInventory() {

        for(Product product : inventory.values()) {
            product.display();
        }

    }

}