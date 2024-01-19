package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);// Add Element in sequence
        System.out.println(intArrayList); //Print List
        System.out.println(intArrayList.get(0)); //Get element of 0th location
        intArrayList.add(1,15); // add element at specific position, it will sift the existing elements
        System.out.println(intArrayList);
        intArrayList.set(1,17); //change the element of given index
        System.out.println(intArrayList);
        intArrayList.remove(1); //remove the element of given index
        System.out.println(intArrayList);
        System.out.println(intArrayList.size()); // gives size of the list
        System.out.println("*****Traversing through simple for loop******");
        for(int i=0;i< intArrayList.size();i++){
            System.out.println(intArrayList.get(i));
        }
        System.out.println("*****Traversing through enhanced for loop******");
        for(int element:intArrayList){
            System.out.println(element);
        }
        System.out.println("*****Traversing through Iterator******");
        Iterator iterator= intArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****Traversing through lambda and foreach******");
        intArrayList.forEach(item->{
            System.out.println(item);
        });
        ArrayList<Integer> newList=new ArrayList<>();
        newList.add(59);
        newList.add(13);
        newList.add(30);
        System.out.println("new List"+newList);
        intArrayList.addAll(newList);// add all elements of any other collection
        System.out.println("Updated intArrayList:"+intArrayList);
        Collections.sort(intArrayList); //sort the list
        System.out.println("Sorted List is: "+intArrayList);
        }
    }

