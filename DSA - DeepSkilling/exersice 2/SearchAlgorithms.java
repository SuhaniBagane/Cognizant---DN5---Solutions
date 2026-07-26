public class SearchAlgorithms {

    public static Product linearSearch(Product[] products,String key){

        for(Product product:products){

            if(product.productName.equalsIgnoreCase(key))
                return product;

        }

        return null;

    }

    public static Product binarySearch(Product[] products,String key){

        int low=0;
        int high=products.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            int compare=products[mid].productName.compareToIgnoreCase(key);

            if(compare==0)
                return products[mid];

            else if(compare<0)
                low=mid+1;

            else
                high=mid-1;

        }

        return null;

    }

}