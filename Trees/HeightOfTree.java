// import java.util.*;

// public class HeightOfTree {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
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

//     public static int height(Node root){
//         if(root == null){
//             return -1;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         int ans = Math.max(lh, rh)+1;


//         return ans;
//     }

//     public static void main(String[] args) {
//         Node root = buildTree();
//         int h = height(root);

//         System.out.println("Height of the tree is: " + h);
//     }
// }
