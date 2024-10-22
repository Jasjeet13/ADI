import java.util.*;

public class InputsforTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildFromLevelorder(){
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int data = sc.nextInt();

        root = new Node(data);

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();

            System.out.println("Enter the left child for " + curr.data + ": ");
            int l = sc.nextInt();

            System.out.println("Enter the right child for " + curr.data + ": ");
            int r = sc.nextInt();

            if(l != -1){
                Node newNode = new Node(l);
                curr.left = newNode;
                q.add(newNode);
            }

            if(r != -1){
                Node newNode = new Node(r);
                curr.right = newNode;
                q.add(newNode);
            } 
        }
        return root;
    }

    public static Node buildTree2(){
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);

        root.left = buildTree2();

        if(root.left == null){
            root.right = null;
        }
        else{
            root.right = buildTree2();
        }

        return root;
    }

    public static Node buildTree3(List<Integer> input){
        Node root = null;

        if(input.isEmpty() || input.get(0)==-1){
            return null;
        }

        root = new Node(input.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int n = input.size();
        int i = 1;

        while(i<n){
            Node curr = q.poll();

            if(input.get(i) != -1){
                curr.left = new Node(input.get(i));
                q.add(curr.left);
            }
            i++;

            if(i<n && input.get(i)!= -1){
                curr.right = new Node(input.get(i));
                q.add(curr.right);
            }
            i++;
        }

        return root;

    }

    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.poll();

            if(curr == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data + " ");

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }

            }
        }

    }

    public static void main(String[] args) {
        // Node root1 = buildFromLevelorder();
        // System.out.println("Building tree using level order - ");
        // levelOrderTraversal(root1);

        // Node root2 = buildTree2();
        // System.out.println("Building tree :- ");
        // levelOrderTraversal(root2);

        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(-1);
        input.add(2);
        input.add(3);
        Node root3 = buildTree3(input);
        System.out.println("Building tree: ");
        levelOrderTraversal(root3);

    }

    
}
