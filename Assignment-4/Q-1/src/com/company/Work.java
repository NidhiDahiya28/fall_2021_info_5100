package com.company;
    public class Work<Integer> implements Runnable{

        ThreadSafeLinkList list;
        int value;

        public Work(ThreadSafeLinkList list, int val) {
            this.list = list;
            this.value = val;
        }

        @Override
        public void run() {
            for(int val = 0; val < 100; val++) {
                System.out.println(Thread.currentThread().getId());
                list.add(value);
            }

            list.addAtPosition(0, 45);
            list.removeAtPosition(30);
            System.out.println(list.getFirst());
            list.addAtPosition(99, 88);
            System.out.println(list.getLast());

            System.out.println(list.size());
        }

    }

