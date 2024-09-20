package Queue;

import java.util.HashSet;

public class LinkedList {

    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void add(String data){
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

    public void remove(){
        if (this.head == null){
            System.out.println(this.head);
        }else {

            Node currNode = this.head.getNext();
            this.head = currNode;

        }
    }

    public void peek(){
        System.out.println(this.head.getData());
    }
    public void print(){
        System.out.println(this.head);
    }

    public void size(){
        Integer size = 0;

        Node currNode = this.head;
        while (currNode != null){
            size++;
            currNode = currNode.getNext();
        }

        System.out.println(size);

    }

    public void pool(){
        Node currNode = this.head;

        while (currNode.getNext() != null){
            currNode = currNode.getNext();
        }

        System.out.println(currNode.getData());

    }

    public void removeDuplicate(){
        Node currNode = this.head;
        Node prev = null;
        HashSet<String> data = new HashSet<>();
        while (currNode != null){

            if (!data.contains(currNode.getData())){
                data.add(currNode.getData());
                prev = currNode;
            }else {
                 prev.setNext(currNode.getNext());

            }

            currNode = currNode.getNext();
        }

    }

    public void pop(){

    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Mike");
        linkedList.add("Deni");

        linkedList.add("Tedi");
        linkedList.print();



    }

}
