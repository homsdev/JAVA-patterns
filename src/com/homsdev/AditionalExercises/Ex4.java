package com.homsdev.AditionalExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        List<String> songTitles = Arrays.asList("humble","element","dna");
        Function<String,String> capitalize = str-> str.toUpperCase();
        songTitles.stream().map(capitalize).forEach(System.out::println);
    }
}
