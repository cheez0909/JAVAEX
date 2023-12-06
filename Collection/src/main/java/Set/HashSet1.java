package Set;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        // Object타입의 배열
        Object[] obj = {"1", Integer.valueOf(5), "2", "4", Double.valueOf(1.5), "1", "2", 5};

        Set set = new HashSet();

        for(int i=0; i<obj.length; i++){
            set.add(obj[i]);
        }

        System.out.println(set);
    }
}

