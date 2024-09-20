package HackerRank.Stack;

import java.util.Stack;

public class LinkedList {

    private Node head;

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

    public String pop(){
        Node currNode = this.head;
        String result = "";
        while (currNode != null){

            if (currNode.getNext().getNext() == null){
                result = currNode.getNext().getData();
                currNode.setNext(null);

            }

            currNode = currNode.getNext();
        }

        return result;

    }

    public void print(){
        System.out.println(this.head);
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("deni");
        linkedList.add("edi");
        linkedList.add("lion");
        linkedList.print();
        String cek = linkedList.pop();
        linkedList.print();
        System.out.println(cek);
//        System.out.println(cek);
//        Stack<Integer> data = new Stack<>();
//        data.push(1);
//        data.push(2);
//        data.push(3);
//        data.push(4);
//        Integer d = data.pop();
//        System.out.println(d);
//        System.out.println(data);

    }
}
