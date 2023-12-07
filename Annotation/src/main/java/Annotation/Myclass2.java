package Annotation;

import java.util.Arrays;

// @Myannotation2(value ="값", nums = {1, 2, 3})
@Myannotation2(nums = {1, 2, 3})
public class Myclass2 {
    public static void main(String[] args) {


        Class cls = Myclass2.class;
        Myannotation2 anno = (Myannotation2) cls.getAnnotation(Myannotation2.class);



        String value = anno.value();
        System.out.println(value);

        int[] nums = anno.nums();
        System.out.println(Arrays.toString(nums));
    }

//    @Myannotation2(nums = {1,2,3})
//    public static int add(int ... a){
//        return Arrays.stream(a).sum();
//    }
}
