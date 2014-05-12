package com.kumar.ternarysearchtreeLucene;

import java.util.ArrayList;


public class TSTreeTest {
    public static void main(String [] args) {
        TSTAutocomplete tst = new TSTAutocomplete();
        ArrayList<TSTNode> suggestions=new ArrayList<TSTNode>();
        TSTNode root = null;
        String s[] = {"hadoop", "bigdata", "jsp", "jsf", "java", ".net", "servlet", "hibernate", "hive", "algos",
                "designs", "design patterns","\\ear","^a","-->342516","-abhinav"};
        for (String eachString : s)
            root = tst.insert(root, eachString, 0);

      /*  System.out.println("Printing all the words...");
          suggestions = tst.prefixSearch(root, "");
        for (TSTNode t : suggestions)
            System.out.println(t.token);*/

        System.out.println("following are the suggested names that are starting with \"des\"");
        suggestions = tst.prefixSearch(root, "^");
        for (TSTNode t : suggestions)
            System.out.println(t.token);

    }

}
