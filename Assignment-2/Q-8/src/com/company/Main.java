package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Example-1");
        String s1 = "egg";
        System.out.println("Input s1 = "+ s1);
        String t1 = "add";
        System.out.println("Input t1 = "+ t1);
        System.out.println(IsomorphicCheck.isomorphic(s1,t1));
        System.out.println();
        System.out.println("Example-2");
        String s2 = "foo";
        System.out.println("Input s2 = "+ s2);
        String t2 = "bar";
        System.out.println("Input t2 = "+ t2);
        System.out.println(IsomorphicCheck.isomorphic(s2,t2));
        System.out.println();
        System.out.println("Example-3");
        String s3 = "paper";
        System.out.println("Input s3 = "+ s3);
        String t3 = "title";
        System.out.println("Input t3 = "+ t3);
        System.out.println(IsomorphicCheck.isomorphic(s3,t3));
        System.out.println();





    }
}
