package Annotation;

import java.util.Arrays;

@Myannotation(value = "값")
public class MyClass {

    @Myannotation(value = "값")
    int num;

    @Myannotation(value = "값")
    public int add(int ... num){
        return Arrays.stream(num).sum();
    }
}
