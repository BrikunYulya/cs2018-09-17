package by.it.brikun.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        ArrayList list1=new ArrayList();
        Collections.addAll(list1,1,2,3);
        ArrayList list2=new ArrayList();
        Collections.addAll(list2,4,5,6);
        ArrayList list3=new ArrayList();
        Collections.addAll(list3,7,8,9);
        ArrayList list4=new ArrayList();
        Collections.addAll(list4,10,11,12);
        ArrayList list5=new ArrayList();
        Collections.addAll(list5,13,14,15);
        int sum;
        sum= list1.size()+list2.size()+list3.size()+list4.size()+list5.size();
        System.out.println(sum);
      /*
        for (int x[]:list1) {
        for (int y:x) {
        System.out.println(y);
        }
        }
        */

        list1.add(list1);
        System.out.println(list1);
}
        //System.out.println(list1);
    }
//}
