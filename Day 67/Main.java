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
    bst.inorderT(bst.root);
    System.out.println();
    bst.postorderT(bst.root);
    System.out.println();
    bst.preorderT(bst.root);
        System.out.println();
        System.out.println(bst.max(bst.root));
        System.out.println(bst.min(bst.root));
    }
}