package HackerRank.Queue;

import java.util.Comparator;
import java.util.Optional;
import java.util.Queue;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if (this.head == null){
            this.head = newNode;
        }else {

            Node<T> currNode = this.head;

            while (currNode.getNext() != null){
                currNode = currNode.getNext();
            }

            currNode.setNext(newNode);
        }

    }

    // Todo . remove queue ambil element pertama
    public void remove(){

        if (this.head == null){
            return;
        }
        Node<T> currNode = this.head;
        Node<T> removeNode = currNode.getNext();
        this.head = removeNode;

    }

    public T peek(){
        if (this.head == null){
            return null;
        }else {
            return this.head.getData();
        }
    }

    public void display(){
        System.out.println(this.head);
    }

    public void size(){

        Node<T> currNode = this.head;

        Integer size = 0;

        while (currNode != null){

            size++;
            currNode = currNode.getNext();
        }

        System.out.println(size);

    }

    public void shorted(){

//        Integer [] data = {4,3,1,2};

//        for (Integer i = 0 ; i <  data.length ; i++){
//
//            for (Integer j = i+1 ; j < data.length - 1 ; j++){
//
//                if (data[i] > data[j]){
//                    Integer temp = data[j];
//                    data[j] = data[i];
//                    data[i] = temp;
//                }
//            }
//        }
        if (this.head == null){
            return;
        }else {

            Node currNode = this.head;
            while (currNode != null){
                Node min = currNode; // 4 3 2 1
                Node index = currNode.getNext(); // 3 2 1



                while (index != null){
                    Integer minInt = (Integer) min.getData();
                    Integer idx = (Integer) index.getData();

                    if (minInt > idx){
                        min = index;
                    }


                    index = index.getNext();
                }

                Integer temp = (Integer) currNode.getData(); // 2
                currNode.setData(min.getData());
                min.setData(temp);

                currNode = currNode.getNext();

            }

        }

        System.out.println(this.head);


    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);

        linkedList.shorted();




    }
}
