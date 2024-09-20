package HackerRank.ReverseLinkedList;

public class Node {

    private Integer data;
    private Node next;


    public Node(Integer data){
        this.data = data;
        this.next = null;
    }

    public Integer getData(){
        return this.data;
    }

    public void setData(Integer data){
        this.data = data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }


}