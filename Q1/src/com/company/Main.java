package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Question-4");
        String s1 = "abcabcbb";
        System.out.println("Input: " +s1);
        System.out.println("Output:" +LongestStr.longestSub(s1));


        System.out.println();
        System.out.println("Question-3");
        int[] input1 = {1,3,-1,3,4,-1};
        System.out.println("Input: "+Arrays.toString(input1));
        System.out.println("Output: "+repeatedSum.repeatingSum(input1));


        System.out.println();
        System.out.println("Question 2: Singleton");
        Printer p1 = Printer.getInstance();
        p1.getConnection();

        System.out.println();
        System.out.println("Question-1");
        int frankensteinBorrowDate = 2;
        int frankensteinReturnDate = 11;
        int anneFrankBorrowDate = 1;
        int anneFrankReturnDate = 14;
        int givenDate = 13;
        Fiction frankenstein = new Fiction("Frankenstein", 4.99, "1908");
        NonFiction anneFrank = new NonFiction("Anne Frank", 6.99, "1961");
        Reference worldMap = new Reference("World Maps", 2.99, "2021");
        System.out.println(frankenstein.description());
        System.out.println(anneFrank.description());
        System.out.println(worldMap.description());
        frankenstein.setBorrowDate(frankensteinBorrowDate);
        frankenstein.setReturnDate(frankensteinReturnDate);
        System.out.println("Available Status: " + frankenstein.isAvailable(givenDate));
        anneFrank.setBorrowDate(anneFrankBorrowDate);
        anneFrank.setReturnDate(anneFrankReturnDate);
        System.out.println("Available Status: " + anneFrank.isAvailable(givenDate));





        }


    }




