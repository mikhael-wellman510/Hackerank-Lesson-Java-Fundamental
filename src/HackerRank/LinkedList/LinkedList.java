package HackerRank.LinkedList;

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

            Node currNode = this.head;

            while (currNode.getNext() != null){

                currNode = currNode.getNext();
            }

            currNode.setNext(newNode);

        }
    }

    public void reverse(){

        Node prev = null;
        Node curr = this.head;
        Node next = null;

        while (curr != null){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        this.head = prev;

    }

    public void sorted(){
        Node curr = this.head;

        while (curr != null){
            Node idx = curr.getNext();
            Node min = curr;

            while (idx != null){
                if (min.getData() < idx.getData()){
                    min = idx;
                }

                idx = idx.getNext();
            }

            Integer temp =curr.getData(); // 8
            curr.setData(min.getData());
            min.setData(temp);

            curr = curr.getNext();

        }


    }

    public void print(){
        System.out.println(this.head);
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.print();
        linkedList.sorted();
        linkedList.print();
    }
}
