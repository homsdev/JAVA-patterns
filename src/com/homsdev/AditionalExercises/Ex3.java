package com.homsdev.AditionalExercises;

import java.util.function.Function;

public class Ex3 {
    public String processFunction(Integer number, Function<Integer,String> lambda){
        return lambda.apply(number);
    }
}
