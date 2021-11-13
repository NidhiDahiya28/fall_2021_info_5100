package com.company;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeLinkList {
    private LinkedList<Integer> list1 = new LinkedList<>();

    ReentrantReadWriteLock locker = new ReentrantReadWriteLock();

    public void add(int sub1) {
        locker.writeLock().lock();
        list1.add(sub1);
        locker.writeLock().unlock();
    }

    public void addAtPosition(int index, Integer sub2) {
        locker.writeLock().lock();
        list1.add(index, sub2);
        locker.writeLock().unlock();
    }

    public void removeAtPosition(Integer sub3) {
        locker.writeLock().lock();
        list1.remove(sub3);
        locker.writeLock().unlock();
    }

    public Integer getFirst() {
        Integer sub4;
        locker.readLock().lock();
        sub4 = list1.getFirst();
        locker.readLock().unlock();
        return sub4;
    }

    public Integer getLast() {
        Integer sub5;
        locker.readLock().lock();
        sub5 = list1.getLast();
        locker.readLock().unlock();
        return sub5;
    }

    public int size() {
        int size;
        locker.readLock().lock();
        size = list1.size();
        locker.readLock().unlock();
        return size;
    }
}