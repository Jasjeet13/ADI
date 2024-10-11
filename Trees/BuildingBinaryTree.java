// package Trees;
// import java.util.*;

// public class BuildingBinaryTree {
//     public Node root;

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node createBinaryTree(){
    //    Node root = null;
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println(" -> Enter value: ");
    //    int data = sc.nextInt();

    //    if(data == -1){
    //     return null;
    //    }

    //    root = new Node(data);

    //    System.out.println("Enter value for the left child of " + root.data);
    //    root.left = createBinaryTree();

    //    System.out.println("Enter value for the right child of " + root.data);
    //    root.right = createBinaryTree();

    //    return root;



//     }
    
//     public static void main(String[] args) {
//         Node root = createBinaryTree();
//     }
// }
