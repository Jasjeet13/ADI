// import java.util.LinkedList;
// import java.util.Queue;

// public class BST {
//     public static class Node{
//         int data;
//         Node right;
//         Node left;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node buildTree(int[] array,int start,int end){

//         if(start>end){
//             return null;
//         }

//         int middle = (start+end)/2;
//         Node root = new Node(array[middle]);

//         root.left = buildTree(array, start, middle-1 );
//         root.right = buildTree(array, middle+1, end);

//         return root;                   
//     }

//     public static void levelOrder(Node root){
//         if(root == null){
//             return;
//         }

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);

//         while(!q.isEmpty()){
//             Node curr = q.poll();
//             if(curr == null){
//                 System.out.println();
//                 if(q.isEmpty()){
//                     break;
//                 }
//                 else{
//                     q.add(null);
//                 }
//             }
//             else{
//                 System.out.print(curr.data + " ");

//                 if(curr.left != null){
//                     q.add(curr.left);
//                 }
//                 if(curr.right != null){
//                     q.add(curr.right);
//                 }
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5, 6, 7}; 
//         int n = array.length;

//         Node root = buildTree(array, 0, n - 1);

//         System.out.println("Level-order traversal of the Binary Search Tree:");
//         levelOrder(root);
//     }
// }