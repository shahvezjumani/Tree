import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();
        tree.insert(scanner);
        tree.displayTree();
    }
}
