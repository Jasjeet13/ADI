// import java.util.*;

// public class DeletingInBst {

//     public static class Node{
//         int data;
//         Node right;
//         Node left;

//         Node(int data){
//             this.data = data;
//             this.right = null;
//             this.left = null;
//         }
//     }

//     public static Node buildTree(int[] array,int start , int end){
//         if(start > end){
//             return null;
//         }

//         int mid = (start+end)/2;
//         Node root = new Node(array[mid]);

//         root.left = buildTree(array,start,mid-1);
//         root.right = buildTree(array, mid+1, end);

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


//     public static Node deleteNode(Node root , int n){
//         if(root == null){
//             return null;
//         }

//         else if(root.data != n){
//             if(root.data >=n){
//                 root.left = deleteNode(root.left, n);
//             }
//             else{
//                 root.right = deleteNode(root.right, n);
//             }
//         }

//         else{
//             if(root.right == null && root.left == null){
//                 return null;
//             }

//             else if(root.right == null){
//                 return root.left;
//             }

//             else if(root.left == null){
//                 return root.right;
//             }

//             else{
//                 int min = predecessor(root.left);
//                 root.data = min;

//                 root.left = deleteNode(root.left, root.data);
            
//             }
//         }

//         return root;

//     }

//     public static int predecessor(Node root){
//         while(root.right != null){
//             root = root.right;
//         }
//         return root.data;
//     }

//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5, 6, 7}; 
//         int n = array.length;

//         Node root = buildTree(array, 0, n - 1);

//         System.out.println("Level-order traversal of the Binary Search Tree:");
//         levelOrder(root);
        
//         root = deleteNode(root,4);
//         System.out.println("Level-order traversal of the Binary Search Tree:");
//         levelOrder(root);
//     }
// }
