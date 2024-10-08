package Maps;
import java.util.*;;

public class TableWithChaining {
    public LinkedList<Node>[] Table;
    public int size;

    static class Node{
        int key;
        String value;

        public Node(int key , String value){
            this.key = key;
            this.value = value;
        }

    }

    @SuppressWarnings("unchecked")
    public TableWithChaining(int size){
        this.size = size;
        Table = new LinkedList[size];
        for(int i=0;i<size;i++){
            Table[i] = new LinkedList<>();

        }
    }

    public int hash(int key){
        return key% this.size;
    }

    public void put(int key , String value){
        int index = hash(key);

        for(Node n : Table[index]){
            if(n.key == key){
                n.value = value;
                return ;
            }
        }

        Node entry = new Node(key,value);
        Table[index].add(entry);
    }

    public String get(int key){
        int index = hash(key);
        for(Node n : Table[index]){
            if(n.key == key){
                return n.value;
            }
        }

        return "Value not found";
    }

    public static void main(String[] args) {
        TableWithChaining hashTable = new TableWithChaining(10);
        hashTable.put(123,"Apple");
        hashTable.put(245,"Kiwi");
        hashTable.put(243,"Orange");

        System.out.println(hashTable.get(243));
        System.out.println(hashTable.get(145));
    }

}
