// import java.util.*;

// public class CountTotalNodes {
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node buildTree(){
//         Node root = null;
//         Scanner sc = new Scanner(System.in);
//         int data = sc.nextInt();

//         if(data == -1){
//             return null;
//         }

//         root = new Node(data);

//         root.left = buildTree();
//         root.right = buildTree();

//         return root;
//     }

//     public static int countNodes(Node root){
//         if(root == null){
//             return 0;
//         }

//         int lf = countNodes(root.left);
//         int rh = countNodes(root.right);
//         int ans = lf + rh + 1;
//         return ans;
//     }

//     public static void main(String[] args) {
//         Node root = buildTree();

//         System.out.println("Total number of nodes in the tree: " + countNodes(root));
//     }
// }
