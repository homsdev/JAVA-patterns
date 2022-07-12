package com.homsdev.AditionalExercises;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ex1 {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<String>();
        dates.add("12/01/2020");
        dates.add("12/02/2020");

        //Aproach no 1
        Function<String, String> replaceSlashes = date -> date.replace("/", "-");
        dates.forEach(date -> replaceSlashes.apply(date));

        //Aproach no 2
        Consumer<String> replaceSlashesConsumer = date -> {
            date = date.replace("/", "-");
        };

        //Aproach 3
        UnaryOperator<String> replaceSlashesOperator = date -> date.replace("/", "-");
        dates.forEach(date->{
            date = replaceSlashesOperator.apply(date);
            System.out.println(date);
        });
    }
}
