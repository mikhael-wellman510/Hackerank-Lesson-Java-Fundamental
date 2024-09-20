package HackerRank.InsertingNode;

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

    public void print(){
        Node curr = this.head;
        String res = "";


        while (curr != null){
            res = res + curr.getData() + " ";
            curr =  curr.getNext();
        }

        System.out.println(res);

    }

    public void insertNode(Integer data){

        add(data);

        Node curr = this.head;

        while (curr != null){
            Node nextCurr = curr.getNext();
            Node min = curr;

            while (nextCurr != null){
                if (min.getData() > nextCurr.getData()){
                    min = nextCurr;
                }
                nextCurr = nextCurr.getNext();

            }

            Integer getMin = min.getData();
            min.setData(curr.getData());
            curr.setData(getMin);

            curr = curr.getNext();

        }

    }



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Integer testCase = sc.nextInt();


            for (Integer i = 0 ; i < testCase ; i++){
                Integer len = sc.nextInt();
                LinkedList linkedList = new LinkedList();
                for (Integer j = 0 ; j < len ; j++){

                    linkedList.add(sc.nextInt());

                }
                linkedList.insertNode(sc.nextInt());
                linkedList.print();
            }


    }

}
