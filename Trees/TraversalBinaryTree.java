// package Trees;
// import java.util.*;

// public class TraversalBinaryTree {
//     static public class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static public Node createTree(){
//         Node root = null;
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" -> Enter value: ");
//        int data = sc.nextInt();

//        if(data == -1){
//         return null;
//        }

//        root = new Node(data);

//        System.out.println("Enter value for the left child of " + root.data);
//        root.left = createTree();

//        System.out.println("Enter value for the right child of " + root.data);
//        root.right = createTree();

//        return root;
//     }

//     static public void preorder(Node root){
//         // root -> left -> right
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     static public void inorder(Node root){
//         //  left -> root -> right
//         if(root == null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);

//     }
//     static public void postorder(Node root){
//         // left -> right -> root
//         if(root==null){
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data + " ");
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
//         Node root = createTree();
//         System.out.print("Preorder Traversal: ");
//         preorder(root);
//         System.out.println();
//         System.out.print("Inorder Traversal: ");
//         inorder(root);
//         System.out.println();
//         System.out.print("Postorder Traversal: ");
//         postorder(root);
//         System.out.println();
//         System.out.print("Levelorder Traversal: ");
//         levelOrder(root);
//         System.out.println();
        
//     }
// }
