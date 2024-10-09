// package Maps;
// import java.util.*;

// public class hashmapQuestion {

    // QUESTION 1 -> Count Character Frequencies
    // Given a string, count the frequency of each character using a HashMap.
    // Example: Input: "apple" → Output: {'a': 1, 'p': 2, 'l': 1, 'e': 1}
    // public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    String input = sc.nextLine();
    //    char[] array = input.toCharArray();
    //     HashMap<Character,Integer> ans = new HashMap<>();
    //    for(char ch : array){
    //     int frequency = ans.getOrDefault(ch,0);
    //     ans.put(ch,frequency+1);
    //    }
    //    for(Map.Entry<Character,Integer> entry : ans.entrySet()){
    //     System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
    //    }
    //    System.out.println();
    //    sc.close();
    // }


    // QUESTION 2 -> Given a string, find the first non-repeating character. If there’s no 
    // unique character, return -1.
    // Example: Input: "swiss" → Output: 'w' (first unique character)
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String input = sc.nextLine();
    //     char[] array = input.toCharArray();
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     for(char ch : array){
    //         int frequency = map.getOrDefault(ch, 0);
    //         map.put(ch,frequency+1);
    //     }
    //     for(char ch: array){
    //         if(map.get(ch) == 1){
    //             System.out.println("First non repeating character: " + ch);
    //             break;
    //         }
    //     }
    //     sc.close();
    // }


    // QUESTION 3 -> Count Word Frequencies in a Sentence Given a sentence, 
    // count how many times each word appears using a HashMap. Example: 
    // Input: "the dog chased the cat" → Output: {"the": 2, "dog": 1, "chased": 1, "cat": 1}
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String input = sc.nextLine();
    //     String[] array = input.split("\\s+");
    //     HashMap<String,Integer> map = new HashMap<>();
    //     for(String word : array){
    //         int frequency = map.getOrDefault(word, 0);
    //         map.put(word,frequency+1);
    //     }

    //     for(Map.Entry<String,Integer> entry : map.entrySet()){
    //         System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
    //     }
    //     sc.close();
    // }


    // QUESTION 4 ->  Check for Duplicates in Array Given an integer array, 
    // return true if any element appears at least twice, or false otherwise. 
    // Example: Input: [1, 2, 3, 1] → Output: true
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int[] array = new int[n];
    //     for(int i=0;i<n;i++){
    //         array[i] = sc.nextInt();
    //     }

    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(Integer i : array){
    //         int frequency = map.getOrDefault(i, 0);
    //         map.put(i,frequency+1);
    //     }

    //     int duplicate = 

    //     sc.close();
    // } 
    
// }
