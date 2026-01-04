import java.util.*;
class One{
    public static void main(String []args){
        //BY HASHMAP
        HashMap<String, Integer> map=new HashMap<>();

        map.put("A",93);
        map.put("B",89);
        map.put("C",91);

        System.out.println(map.get("B"));
        System.out.println(map.getOrDefault("D",92));
        System.out.println(map.containsKey("C"));
        System.out.println(map.containsValue(45));

        //BY HASHSET
        HashSet<Integer> set=new HashSet<>();

        set.add(56);
        set.add(76);
        set.add(87);
        set.add(93);
        set.add(87);

        System.out.println(set); // element repeated but here in set only unique only shown, that is.: one time 

        //BY TREEMAP
        TreeMap<String, Integer> tree=new TreeMap<>();
        //STORES IN SORTED ORDER

        tree.put("A",93);
        tree.put("C",89);
        tree.put("B",91);
            //here sorted as per the key value: A, B, C
        System.out.println(tree);
    }

    
}