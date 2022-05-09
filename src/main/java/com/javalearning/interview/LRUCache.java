package com.javalearning.interview;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {

    Deque<Integer> queue = new LinkedList<>();
    Set<Integer> set = new HashSet<>();
    int CACHE_LIMIT = 4;
    public void get(){
//        return set[];
    }

    public void put(int data){
        if(!set.contains(data)){
            if(set.size() == CACHE_LIMIT){
                Integer page =  queue.poll();
                set.remove(page);
            }
        }else {
            queue.poll();
        }
        queue.add(data);
        set.add(data);
    }

    public void print(){

    }
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache();
        lruCache.put(1);
    }
}
