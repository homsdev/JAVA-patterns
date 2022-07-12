package com.homsdev.adapterPattern.realExample;

import java.util.*;

public class TestRealExamples {

    public static void main(String[] args) {
        List<String> testlist = new ArrayList<>(Arrays.asList("John","Max","Zoe"));
        Iterator<String> testIterator = testlist.listIterator();
        Enumeration iteratorToEnumeration = new IteratorEnumeration(testIterator);

        while (iteratorToEnumeration.hasMoreElements()){
            System.out.println(iteratorToEnumeration.nextElement());
        }
    }
}
