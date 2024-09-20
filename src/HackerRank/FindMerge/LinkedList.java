package HackerRank.FindMerge;

public class LinkedList {

    private Node head;
    public LinkedList(){
        this.head = null;
    }

    public void add(Integer data){
        Node newNode = new Node(data);

        if (this.head == null){
            this.head = newNode;
        }else {
            Node curr = this.head;

            while (curr.getNext() != null){
                curr = curr.getNext();
            }

            curr.setNext(newNode);
        }

    }

    public void getNodeValue(Integer n){

        Node curr = this.head;
        Integer len = 0;
        while (curr .getNext()!= null){

            len++;
            curr = curr.getNext();

        }

        Node newCurrent = this.head;
        Integer node = len - n;
        for (Integer i = 0 ; i < node ; i++){
            newCurrent = newCurrent.getNext();
        }

        System.out.println(newCurrent.getData());

    }

    public void sort(){

        Node curr = this.head;

        while (curr != null){

            Node next = curr.getNext();
            Node temp = curr;

            while (next != null){
                if (next.getData() > temp.getData()){
                    temp = next;
                }
                next = next.getNext();
            }

            Integer get = curr.getData();
            curr.setData(temp.getData());
            temp.setData(get);

            curr = curr.getNext();
        }

    }
    public void print(){
        System.out.println(this.head);
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(4);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(7);
        linkedList1.add(1);
        linkedList1.sort();
        linkedList1.print();
    }
}
