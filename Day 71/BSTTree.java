import java.util.Stack;
public class BSTTree {
    private class Node{
        private int data;
        private Node lC;
        private Node rC;
        Node(){

        }
        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }
    Node root;
    public void insert(int value){
        Node node=new Node(value);

        if(root==null) {
            root= node;
            return;
        }
        Node current=root;
        while(true){
            if(current.data<value){
                if(current.rC==null) {
                    current.rC = node;
                    return;
                }
                current=current.rC;

            }
            else if(current.data>value){

                    if(current.lC==null) {
                        current.lC = node;
                        return;
                    }
                    current=current.lC;
            }
            else{
                return;
            }
        }

    }
    public boolean search(int key){
        Node current =root;
        while(current!=null){
            if(current.data<key)
             current=current.rC;
         else if(current.data>key)
             current=current.lC;
         else
                return true;
        }
        return false;
    }
    private Node findNode(int key){
        if(search(key)) {
            Node current = root;
            while (current != null) {
                if (current.data < key)
                    current = current.rC;
                else if (current.data > key)
                    current = current.lC;
                else
                    return current;

            }
        }
        return null;
    }
    public int leftChildNode(int key){
        Node demo=findNode(key);
        if(demo!=null){
           if(demo.lC!=null)
            return demo.lC.data;
           else
               return -1;
        }
        return -1;
    }
    public int rightChildNode(int key){
        Node demo=findNode(key);
        if(demo!=null){
            if(demo.rC!=null)
                return demo.rC.data;
            else
                return -1;
        }
        return -1;
    }
    public int leftGrandChildNode(int key){
        Node demo=findNode(key);
        if(demo!=null){
            if(demo.lC!=null)
                return demo.lC.lC.data;
            else
                return -1;
        }
        return -1;
    }
    public int rightGrandChildNode(int key){
        Node demo=findNode(key);
        if(demo!=null){
            if(demo.rC!=null)
                return demo.rC.rC.data;
            else
                return -1;
        }
        return -1;
    }
    public void inorderT(Node Current) {
        if(Current==null)
            return;

        inorderT(Current.lC);
        System.out.print(Current.data+" ");
        inorderT(Current.rC);

    }
    public void preorderT(Node Current) {
        if(Current==null)
            return;

        System.out.print(Current.data+" ");
        preorderT(Current.lC);
        preorderT(Current.rC);

    }
    public void postorderT(Node Current) {
        if(Current==null)
            return;

        postorderT(Current.lC);
        postorderT(Current.rC);
        System.out.print(Current.data+" ");
    }
    public int max(Node Current){
        if(Current.rC==null)
            return Current.data;

        return max(Current.rC);
    }
    public int min(Node Current){
        if(Current.lC==null)
            return Current.data;

        return min(Current.lC);
    }


    public int height(Node root){
        if(root==null)
            return 0;

        return 1+Math.max(height(root.lC),height(root.rC));
    }
    public int noOfLeaf(Node root){
        if(root==null)
            return 0;
        else if(root.lC==null && root.rC==null)
            return 1;
        else
            return noOfLeaf(root.lC)+noOfLeaf(root.rC);
    }
    public void printLeafNodes(Node root){
        if(root==null)
            return ;
        Stack<Node> st=new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            root=st.peek();
            st.pop();


            if(root.lC==null && root.rC==null )
                System.out.print(root.data+" ");

            if(root.lC!=null)
                st.push(root.lC);

            if(root.rC!=null)
                st.push(root.rC);

        }



    }
    public int sizeOfTree(Node root){
        if(root==null)
            return 0;

        return 1+sizeOfTree(root.lC)+sizeOfTree(root.rC);
    }
    public void printLevelNodes(Node root,int level){
        if(root==null)
            return ;
        if(level==1)
         System.out.print(root.data+" ");
        else if (level>1) {
            printLevelNodes(root.lC,level-1);
            printLevelNodes(root.rC,level-1);


        }
    }
    void printLRChild(Node root) {
        if (root == null)
            return;
        else {
            if (root.lC != null && root.rC != null)
                System.out.println(root.lC.data + " " + root.rC.data);
            else if (root.lC != null)
                System.out.println(root.lC.data + " " + "right child is null");
            else if (root.rC != null)
                System.out.println("left child is null" + " " + root.rC.data);

        }

    }
       public void printSubTree(int value){
        if(search(value))
             inorderT(findNode(value));
        }
    public void printNodesLevelWise(Node root){
        int n=height(root);
        for(int i=1;i<=n;i++){
            printLevelNodes(root,i);
        }
    }
}
