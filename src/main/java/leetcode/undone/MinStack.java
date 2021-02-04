package leetcode.undone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinStack {
    private LinkedList<Integer> list;
    private LinkedList<Integer> list2;
    /** initialize your data structure here. */
    public MinStack() {
        list = new LinkedList<>();
        list2 = new LinkedList<>();
    }

    public void push(int x) {
        if(list.size() == 0){
            list2.add(x);
        }else{
            int last = list2.get(list2.size() - 1);
            int min = Math.min(last,x);
            list2.add(min);
        }
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
        list2.remove(list2.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return list2.get(list2.size() - 1);
    }
}
