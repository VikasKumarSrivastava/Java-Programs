import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int next : list) {
            System.out.print(next+" ");
        }
        System.out.println();
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int next = itr.next();
            if(next ==5){
                itr.remove();
            }
        }

        System.out.println(list);

        list.add(null);
        list.add(null);
        list.add(null);
        //System.out.println(list.indexOf(7)); //-1
        System.out.println(list.indexOf(5));
        System.out.println(list.lastIndexOf(5));
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(1));

        boolean res = list.remove(null);
        System.out.println(res);
        boolean res2  = list.remove(new Integer(10));
        System.out.println(res2);
//        list.clear();
//        System.out.println(list);
        List<String> li = new ArrayList<>();
        li.add("apple");
        li.add("banana");
        li.replaceAll((ele)->ele.toUpperCase());
        System.out.println(li);
        li.set(1,"Pineapple");
        System.out.println(li);
        if(li.contains("APPLE")){
            System.out.println("element in present");
        }else{
            System.out.println("element not present");
        }


    }
}
