package leetcode.done;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyCircularQueue {

    private int maxSize;

    private int num = 0;

    private LinkedList<Integer> list;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        maxSize = k;
        list = new LinkedList<Integer>();
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(list.size() >= maxSize){
            return false;
        }
        num++;
        return list.add(value);
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(list == null || list.size() <= 0){
            return false;
        }
        num--;
        return list.remove(list.get(0));
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(list == null || list.size() <= 0){
            return -1;
        }
        return list.get(0);
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(list == null || list.size() <= 0){
            return -1;
        }
        return list.get(num - 1);
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return num == maxSize;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */