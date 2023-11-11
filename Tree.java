import java.util.Scanner;
public class Tree {
    Node root;

    public void insert(Scanner scanner){
        System.out.print("Enter the Value of the Root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner,root);
    }
    public void insert(Scanner scanner,Node node){
        System.out.println("Do yo want to insert value in the Left of the "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value that is Left to "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner,node.left);
        }

        System.out.println("Do yo want to insert value in the right of the "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value that is right to "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner,node.right);
        }
    }
    public void displayTree(){
        displayTree(root);
        System.out.println();
        displayTree1(root);
        System.out.println();
        displayTree2(root);
    }
    public void displayTree(Node node){
        if(node == null){
            return;
        }
        displayTree(node.left);
        displayTree(node.right);
        System.out.print(" "+node.value);
    }
    public void displayTree1(Node node){
        if(node == null){
            return;
        }
        displayTree(node.left);
        System.out.print(" "+node.value);
        displayTree(node.right);
    }
    public void displayTree2(Node node){
        if(node == null){
            return;
        }
        System.out.print(" "+node.value);
        displayTree(node.left);
        displayTree(node.right);
    }
}
