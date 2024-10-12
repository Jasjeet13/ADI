// import java.util.*;

// public class BalancedTree {
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

//     public static Node buildTree() {
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

//     public static int height(Node root){
//         if(root == null){
//             return -1;
//         }

//         int l = height(root.left);
//         int r = height(root.right);
//         int ans = Math.max(l, r) +1;

//         return ans;
//     }

//     public static boolean balancedOrNot(Node root){
//         if(root == null){
//             return true;
//         }

//         boolean lf = balancedOrNot(root.left);
//         boolean rh = balancedOrNot(root.right);
//         int df = height(root.left) - height(root.right);
//         boolean ans = Math.abs(df) <= 1;

//         if(lf && rh && ans){
//             return true;
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         Node root = buildTree();

//         System.out.println("Is the tree balanced: " + balancedOrNot(root));
//     }
// }
