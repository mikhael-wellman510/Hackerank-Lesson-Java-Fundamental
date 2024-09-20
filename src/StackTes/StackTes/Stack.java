package StackTes.StackTes;

public class Stack {

    private Node head;

    public Stack(){
        this.head = null;
    }

    public void push(Object data){

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

    public void pop(){

        Node currNode = this.head;

        while (currNode != null){
            if (currNode.getNext().getNext() == null){
                currNode.setNext(null);

            }
            currNode = currNode.getNext();
        }

    }

    public Object peek(){
        Node currNode = this.head;

        while (currNode.getNext() != null){

            currNode = currNode.getNext();
        }

        return currNode.getData();

    }

    public void print(){
        System.out.println(this.head);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("deni");
        stack.push("aldi");
        stack.push("seno");
        stack.print();
        stack.pop();
        stack.print();
        System.out.println(stack.peek());
    }
}
