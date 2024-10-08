package HashTable;

public class TableWithOpenAdd {
    int size;
    Node[] table;

    static class Node{
        int key;
        String value;

        Node(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public TableWithOpenAdd(int size){
        this.size = size;
        table = new Node[size];
    }

    public int hash(int key){
        return key%size;
    }

    public void putLinear(int key,String value){
        int index = hash(key);

        while(table[index]!=null && table[index].key != key){
            index = (index+1)%size;
        }

        table[index] = new Node(key,value);
    }

    public String getLinear(int key){
        int index = hash(key);
        while(table[index] != null){
            if(table[index].key == key){
                return table[index].value;
            }

            index = (index+1)%size;
        }
        return "Value not found";
    }

    public void putQuadratic(int key,String value){
        int index = hash(key);
        int i = 1;
        while(table[index]!= null && table[index].key!=key){
            index = (index+ i*i) % size;
            i++;
        }

        table[index] = new Node(key,value);
    }

    public String getQuadratic(int key){
        int index = hash(key);
        int i = 1;

        while(table[index] != null){
            if(table[index].key == key){
                return table[index].value;
            }
            index = (index+ i*i)%size;
            i++;
        }

        return "Value not found";
    }

    public void putDoubleHash(int key, String value){
        int index = hash(key);
        int step = hash2(key);
        int i = 1;

        while(table[index]!=null && table[index].key!=key){
            index = (index+ i*step) % size;
            i++;
        }

        table[index] = new Node(key, value);
    }

    public int hash2(int key){
        return 7 - (key%7);
    }

    public String getDoubleHash(int key){
        int index = hash(key);
        int step = hash2(key);
        int i = 1;

        while(table[index]!=null){
            if(table[index].key == key){
                return table[index].value;
            }

            index = (index + i*step)%size;
            i++;
        }

        return "Value not found";
    }

    public static void main(String[] args) {
        TableWithOpenAdd hashTable1 = new TableWithOpenAdd(10);

        // Test Linear Probing
        System.out.println("Testing Linear Probing:");
        hashTable1.putLinear(10, "Value A");
        hashTable1.putLinear(20, "Value B");
        hashTable1.putLinear(30, "Value C");
        System.out.println("Get key 10: " + hashTable1.getLinear(10));
        System.out.println("Get key 20: " + hashTable1.getLinear(20));
        System.out.println("Get key 30: " + hashTable1.getLinear(30));
        System.out.println("Get key 40 (non-existent): " + hashTable1.getLinear(40));
        
        TableWithOpenAdd hashTable2 = new TableWithOpenAdd(10);
        System.out.println("\nTesting Quadratic Probing:");
        hashTable2.putQuadratic(11, "Value X");
        hashTable2.putQuadratic(21, "Value Y");
        hashTable2.putQuadratic(31, "Value Z");
        System.out.println("Get key 11: " + hashTable2.getQuadratic(11));
        System.out.println("Get key 21: " + hashTable2.getQuadratic(21));
        System.out.println("Get key 31: " + hashTable2.getQuadratic(31));
        System.out.println("Get key 41 (non-existent): " + hashTable2.getQuadratic(41));

        TableWithOpenAdd hashTable3 = new TableWithOpenAdd(10);
        System.out.println("\nTesting Double Hashing:");
        hashTable3.putDoubleHash(12, "Value P");
        hashTable3.putDoubleHash(22, "Value Q");
        hashTable3.putDoubleHash(32, "Value R");
        System.out.println("Get key 12: " + hashTable3.getDoubleHash(12));
        System.out.println("Get key 22: " + hashTable3.getDoubleHash(22));
        System.out.println("Get key 32: " + hashTable3.getDoubleHash(32));
        System.out.println("Get key 42 (non-existent): " + hashTable3.getDoubleHash(42));
    }

}
