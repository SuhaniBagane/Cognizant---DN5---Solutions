public class Main {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.add(new Task(1,"Design UI","Pending"));

        list.add(new Task(2,"Develop Backend","In Progress"));

        list.traverse();

    }

}