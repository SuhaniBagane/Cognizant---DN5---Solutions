public class TaskLinkedList {

    Task head;

    public void add(Task task){

        if(head==null){

            head=task;

            return;

        }

        Task temp=head;

        while(temp.next!=null){

            temp=temp.next;

        }

        temp.next=task;

    }

    public void traverse(){

        Task temp=head;

        while(temp!=null){

            System.out.println(temp.taskId+" "+temp.taskName+" "+temp.status);

            temp=temp.next;

        }

    }

    public Task search(int id){

        Task temp=head;

        while(temp!=null){

            if(temp.taskId==id)

                return temp;

            temp=temp.next;

        }

        return null;

    }

    public void delete(int id){

        if(head==null)

            return;

        if(head.taskId==id){

            head=head.next;

            return;

        }

        Task temp=head;

        while(temp.next!=null){

            if(temp.next.taskId==id){

                temp.next=temp.next.next;

                return;

            }

            temp=temp.next;

        }

    }

}