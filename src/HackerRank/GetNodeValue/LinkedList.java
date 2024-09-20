package HackerRank.GetNodeValue;

import java.util.Scanner;

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

    public void getNode(Integer n){

        Node curr = this.head;

        Integer temp = 0 ;

        while (curr != null){
            temp++;
            curr = curr.getNext();
        }

        Integer len = temp - n;
        Node next = this.head;
        for (Integer i = 0 ; i <  len-1 ; i++){
            next = next.getNext();
        }

        System.out.println(next.getData());


    }
    public void print(){
        System.out.println(this.head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer testCase = sc.nextInt();

        for (Integer i = 0 ; i < testCase ; i++){
            Integer len = sc.nextInt();
            LinkedList linkedList = new LinkedList();
            for (Integer j= 0 ; j < len ; j++){
                linkedList.add(sc.nextInt());
            }
            linkedList.getNode(sc.nextInt());
        }

//
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        linkedList.getNode(1);
//        linkedList.print();


    }
}
