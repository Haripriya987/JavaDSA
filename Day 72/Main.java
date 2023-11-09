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
        BSTTree bst2=new BSTTree();
        bst2.insert(32);
        bst2.insert(12);
        bst2.insert(65);
        bst2.insert(85);
        bst2.insert(2);
        bst2.insert(10);
        bst2.insert(3);
        boolean res=bst.identical(bst.root, bst2.root);
        System.out.println(res);
//
//    System.out.println(bst2.search(45));
//    bst2.inorderT(bst2.root);
//    System.out.println();
//    bst2.postorderT(bst2.root);
//    System.out.println();
//    bst2.preorderT(bst2.root);
////        System.out.println();
//        bst2.printLevelNodes(bst2.root,3);
//        System.out.println();
//        bst2.printNodesLevelWise(bst2.root);
//        System.out.println();
//        bst2.printLRChild(bst2.root);
//        System.out.println();
//        System.out.println(bst2.noOfLeaf(bst2.root));
//        System.out.println(bst2.sizeOfTree(bst2.root));
//        bst2.printLeafNodes(bst2.root);

//        System.out.println(bst2.max(bst2.root));
//        System.out.println(bst2.min(bst2.root));
//        System.out.println(bst2.leftChildNode(12));
//        System.out.println(bst2.rightChildNode(12));
//        System.out.println(bst2.leftGrandChildNode(32));
//        System.out.println(bst2.rightGrandChildNode(32));
//        System.out.println(bst2.height(bst2.root));
//        System.out.println(bst2.noOfLeaf(bst2.root));
//        System.out.println(bst2.sizeOfTree(bst2.root));
    }
}