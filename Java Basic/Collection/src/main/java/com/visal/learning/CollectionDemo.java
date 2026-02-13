package com.visal.learning;
import java.util.ArrayList;
import java.util.Comparator;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        //add element
        nameList.add("Dara");
        nameList.add("Visal");
        nameList.add("Nan");
        nameList.add("Jing");
        System.out.println(nameList);

        // access Element
        String name = nameList.get(2);
        System.out.println(name);

        // Update element
        nameList.set(2,"Thya");
        System.out.println(nameList);

        //Remove Element
        nameList.remove(0);
        System.out.println(nameList);

        //sort Element
        Comparator<String> SortName = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        nameList.sort(SortName);
        System.out.println(nameList);

        // check if exist element
        System.out.println(nameList.contains("visal"));

        // search element and return index
        System.out.println(nameList.indexOf("Jing"));

        for(String names : nameList){
            System.out.println(names);
        }
    }


}
