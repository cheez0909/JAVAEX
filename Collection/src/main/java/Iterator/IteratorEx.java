package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList orginal = new ArrayList<>(10);
        ArrayList copy1 = new ArrayList<>(10);
        ArrayList copy2 = new ArrayList<>(10);

        for (int i=0; i<10; i++){
            orginal.add(i);
        }

        Iterator iterator = orginal.iterator();
        while (iterator.hasNext()){
            copy1.add(iterator.next());
        }

        System.out.println("==original -> copy1 복사==");
        System.out.println("original : " + orginal);
        System.out.println("copy1 : " + copy1);
        System.out.println();


        iterator = orginal.iterator(); // 재사용이 안되므로 다시 얻어와야 함
        while (iterator.hasNext()){
            copy2.add(iterator.next());
            iterator.remove();
        }

        System.out.println("==original -> copy2 복사==");
        System.out.println("copy1 : " + copy1);
        System.out.println("original : " + orginal);
        System.out.println();
    }
}
