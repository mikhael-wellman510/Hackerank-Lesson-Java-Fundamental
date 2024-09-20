package StackTes;

import java.util.Arrays;

public class Stack<T> {

    private Object [] data ;
    private Integer size = 0; ;
    public Stack(){
        this.data = new Object[this.size];
    }

    public void push(Object n){
        this.size++;
        Object [] arrCopy = Arrays.copyOf(this.data , this.size);

        arrCopy[this.size-1] = n;

        this.data = arrCopy;

    }

    public void pop(){
        if (this.data.length == 0){
            return;
        }
        this.size--;
        Object [] arrCopy = Arrays.copyOf(this.data,this.size);
        this.data = arrCopy;
    }

    public Object peek(){
        if (this.data.length == 0){
            return null;
        }
        return this.data[this.size -1];
    }

    public void print(){
        System.out.println(Arrays.toString(this.data));
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pop();
  
        stack.print();
        System.out.println("peek : " + stack.peek());
    }
}
