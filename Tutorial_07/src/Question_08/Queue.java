package Question_08;

import java.util.ArrayList;

public class Queue <T>{

    private int maxSize;
    private ArrayList<T> queue;

    public Queue(int size){
        this.maxSize = size;
        this.queue = new ArrayList<>(size);
    }

    public void enQueue(T value){
        if(queue.size() < maxSize){
            queue.add(value);
        }else{
            throw new IllegalStateException("Queue is full");
        }
    }

    public T deQueue(){
        if(queue.size() > 0){
            T value = queue.get(0);
            queue.remove(0);
            return value;
        }else {
            throw new IllegalStateException("Queue is empty");
        }
    }

    public String toString(){
        return queue.toString();
    }

}
