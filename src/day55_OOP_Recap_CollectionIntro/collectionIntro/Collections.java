package day55_OOP_Recap_CollectionIntro.collectionIntro;


import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //*********** List Interface Has index ******************
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();

        //*********** Set Interface Does NOT have index *****************
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        //*********** Queue Interface Does NOT have index ******************
        Queue<Integer> queue1 = new PriorityQueue<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        Queue<Integer> queue3 = new LinkedList<>();

        System.out.println("***** implementations of List ***************");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("list = "+list);
        System.out.println("list.get(4) = " + list.get(4));

        System.out.println("\n***** implementations of Set ***************");
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("set = "+set);
        //System.out.println(set.get(4));

        set.remove(10); // 10 is object here not index number
        System.out.println("After removing 10 from set = "+set);

        System.out.println("\n***** implementations of Queue ***************");
        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("queue = "+queue);
        //System.out.println(queue.get(4));
        
        queue.remove(9);// 9 is object here not index number

        System.out.println("/n******************************************");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 7){
                list.remove(i);
            }
        }
        System.out.println("list = " + list);


    }
}
