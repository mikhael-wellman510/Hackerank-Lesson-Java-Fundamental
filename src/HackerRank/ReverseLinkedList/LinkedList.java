package HackerRank.ReverseLinkedList;

import java.util.Scanner;

public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(Integer data){
        Node nodeNew = new Node(data);

        if (this.head == null){
            this.head = nodeNew;
        }else {

            Node current = this.head;

            while (current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(nodeNew);
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
    public void print(){
        Node curr = this.head;
        String res = "";
        while (curr != null){
            res = res + curr.getData() + " ";
            curr = curr.getNext();
        }
        System.out.println(res);
    }

    public void insertedSort(){
        Node curr = this.head;

        while (curr != null){
            Node next = curr.getNext();
            Node max = curr;

            while (next != null){

                if (max.getData() < next.getData()){
                    max = next;
                }

                next = next.getNext();
            }

            Integer maxData = max.getData();
            max.setData(curr.getData());
            curr.setData(maxData);

            curr = curr.getNext();
        }

    }

    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
//        Integer testCase = sc.nextInt();
//        Integer len = sc.nextInt();
//        LinkedList linkedList = new LinkedList();
//        for (Integer i = 0 ; i < testCase ; i++){
//            for (Integer j = 0 ; j < len ; j++){
//                linkedList.add(sc.nextInt());
//            }
//
//        }
//        linkedList.reverse();
//        linkedList.print();

        LinkedList linkedList = new LinkedList();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(6);
        linkedList.insertedSort();
        linkedList.print();






    }

}
