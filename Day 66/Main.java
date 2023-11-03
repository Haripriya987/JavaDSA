public class Main {
    public static void main(String[] args) {
    BSTTree bst=new BSTTree();
    bst.insert(32);
    bst.insert(12);
    bst.insert(65);
    bst.insert(85);
    bst.insert(21);
    bst.insert(10);
    bst.insert(3);
    System.out.println(bst.search(45));
    }
}