import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products={

                new Product(101,"Laptop","Electronics"),
                new Product(102,"Keyboard","Electronics"),
                new Product(103,"Mouse","Electronics"),
                new Product(104,"Phone","Electronics")

        };

        Product result1=SearchAlgorithms.linearSearch(products,"Mouse");

        if(result1!=null)
            System.out.println("Linear Search Found : "+result1.productName);

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product result2=SearchAlgorithms.binarySearch(products,"Mouse");

        if(result2!=null)
            System.out.println("Binary Search Found : "+result2.productName);

    }

}