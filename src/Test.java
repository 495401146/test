


import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by 49540 on 2017/6/16.
 */
public class Test {
    public static void print(int index,Object obj)
    {
        System.out.println(String.format("{%d},%s",index,obj));
    }
    public static void demoCollection()
    {
        ArrayList list = new ArrayList();
        LinkedList list1 = new LinkedList();
    }
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
     }
}
