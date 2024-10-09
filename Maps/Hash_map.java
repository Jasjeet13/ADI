package Maps;
import java.util.*;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        // INSERTING ELEMENTS INTO THE HASHMAP [put(key,value)]
        // -> We can only insert unique keys
        // -> If we try to insert the same key again with a different value , the value at that key gets updated
        // -> only one key the map can have a null value
        // -> multiple values can be null
        // -> Average TC : O(1)
        // -> Worst case : O(n)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry"); 
        map.put(4, "Mango"); 
        map.put(5, "Kiwi"); 


        // GETTING THE VALUE PRESENT AT A SPECIFIC KEY [get(key)]
        //  ->returns null if the key is not present
        // -> Average TC : O(1)
        // -> Worst case : O(n)
        System.out.println("Value present at key 1: " + map.get(1));

        // WE CAN USE getOrDefault IN CASES WHERE WE WANT TO GIVE A DEFUALT VALUE WHEN THE KEY DOESNOT EXIS
        

        // CHECKING IF A KEY IS PRESENT IN THE HASHMAP [containsKey]
        // -> Average TC : O(1)
        // -> Worst case : O(n)
        System.out.println("Is the key 1 present: " + map.containsKey(1));

        // CHECKING IF A VALUE IS PRESENT IN THE HASHMAP [containsValue]
        // -> TC : O(n)
        System.out.println("Is the value Apple present: " + map.containsValue("Apple"));

        // CHECKING IF A ANYTHING IS PRESENT IN THE HASHMAP [IsEmpty]
        // -> TC : O(1)
        System.out.println("Is the Hashmap empty: " + map.isEmpty());


        // GETTING THE SIZE OF THE HASHMAP [size]
        // -> TC : O(1)
        System.out.println("The size of the hashmap: " + map.size());


        // MAKING THE HASHMAP EMPTY BY REMOVING ALL OF ITS VALUE [clear]
        // -> TC : O(n)
        map.clear();
        System.out.println("After clearing is the hashmap empty: " + map.isEmpty());
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry"); 
        map.put(4, "Mango"); 
        map.put(5, "Kiwi"); 


        // INSERITNG INTO THE HASHMAP ONLY IF THE KEY IS NOT PRESENT 
        // -> Preventing the updation of already existing keys
        // -> Average TC : O(1)
        // -> Worst case : O(n)
        map.putIfAbsent(5, "Hello"); // will do nothing as key already exists
        System.out.println("Value of key 5[Kiwi] after putIfAbsent: " + map.get(5));


        // CHANGING THE VALUE AT A PARTICULAR KEY [replace]
        // -> Average TC : O(1)
        // -> Worst case : O(n)
        map.replace(5, "Orange");
        System.out.println("Changing the value at key 5[Kiwi] , new value: " + map.get(5));


        // CHANGING THE VALUE AT A PARTICULAR KEY IF ITS VALUE IS THE SAME AS GIVEN [replace(key, OldValue , NewValue)]
        // -> Average TC : O(1)
        // -> Worst case : O(n)
        map.replace(5, "Orange" , "Kiwi");
        System.out.println("Changing the value at key 5 only if its Orange , new value: " + map.get(5));


        // GETTING THE SET OF ALL THE KEYS IN HASHMAP [keySet]
        // -> TC : O(n)
        System.out.println("Set of the keys : " + map.keySet());


        // GETTING ALL THE VALUES PRESENT IN THE HASHMAP [values]
        // -> TC : O(n)
        System.out.println("Values present: " + map.values());


        // UPADATING THE VALUE OF A KEY BY MERGING IT OLD VALUE WITH A NEW ONE [merge]
        // -> Average TC : O(1)
        // -> Worst case : O(n)
        map.merge(1, "Green", (oldVal,newVal) -> newVal + " " + oldVal);
        System.out.println("Value of key 1 after merging: " + map.get(1));

        
        // DIFFERENT WAYS TO ITERATE OVER A HASHMAP

        System.out.println("Iterating over a hashmaps keys using keySet");
        for(Integer key : map.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.println("Iterating over a hashmaps values using values");
        for(String value : map.values()){
            System.out.print(value+ " ");
        }
        System.out.println();


        System.out.println("Iterating over the keys and values using entrySet");
        // map.entrySet(): This method returns a Set of Map.Entry objects
        // Map.Entry is a special type of object in Java that represents a single key-value pair from a map
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " -> value : " + entry.getValue());
        }

        
        System.out.println("Iterating over the keys and values using forEach and a lambda expression");
        map.forEach((key,value) -> System.out.println("Key: " + key + " -> value : " + value ));


        System.out.println("Iterating over a map using a iterator and entrySet");
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> curr = iterator.next();
            System.out.println("Key: " + curr.getKey() + " -> value : " + curr.getValue());
        }
    }
    
}
