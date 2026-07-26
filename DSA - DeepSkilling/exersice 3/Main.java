public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(1,"Rahul",4500),
                new Order(2,"Anjali",1200),
                new Order(3,"Riya",7600)

        };

        SortingAlgorithms.quickSort(orders,0,orders.length-1);

        for(Order order : orders){

            System.out.println(order.customerName+" : "+order.totalPrice);

        }

    }

}