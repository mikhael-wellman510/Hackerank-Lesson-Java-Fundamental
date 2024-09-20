package SortedLinkedList;

public class LinkedList {

    private Node head;

    public LinkedList() {
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


    public void display(){
        System.out.println(this.head);
    }

    public void sorted(){

        Node currNode = this.head;

        while (currNode != null){
            Node now = currNode;
            Node next = currNode.getNext();


            while (next != null){

                if (now.getData() > next.getData()){
                    now = next;
                }

               next = next.getNext();
            }

            Integer temp = now.getData();
            now.setData(currNode.getData());
            currNode.setData(temp);

            currNode = currNode.getNext();

        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.sorted();
        linkedList.display();
    }
}
