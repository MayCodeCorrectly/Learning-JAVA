package Week6.Collection;

import java.util. *;

public class TestList {
    static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(98);
        list.add(0);
        list.add(12);
        list.add(0);
        list.add(13);
        list.add(0);
        list.add(-10);
//
//        System.out.println(list);
//        list.remove(1);
        System.out.println(list);

        int count =0;
        for(Integer x:list){
            if(x==0){
                if(count%2 == 0) {
                    int idx = list.indexOf(x);
//                    list.remove(idx); // can not add or remove list while iterating over it
                    // we can modify the items but can not remove//add anything to it
                    list.set(idx,count); // indexOf returns the first occur of element
                }
                count++;
            }
        }
        System.out.println(list);

        // to add/delete items into list use explicit iterator
        ListIterator<Integer> it = list.listIterator();
        boolean flag = true;
        while(it.hasNext()){
            Integer x = it.next();
            if(x==0){
                if(flag) it.remove();
                flag = !flag;
            }
        }
        System.out.println(list);

    }
}
