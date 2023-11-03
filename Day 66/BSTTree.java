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


}
