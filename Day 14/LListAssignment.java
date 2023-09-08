public class LListAssignment {
    public static void main(String[] args){
        LLA list1=new LLA();
        list1.add(32);
        list1.add(46);
        list1.add(45);
        list1.print();
        LLA list2=new LLA();
        list2.add(3);
        list2.add(56);
        list2.print();
        LLA l=new LLA();
        LLA merge = l.mergeList(list1, list2);
        LLA print=new LLA();
        print.printMergeNodes(merge);


    }
}
class LLA{
    Node head;
    int count=0;
    class Node{
        int data;
        Node address;
        Node(int data){
            this.data=data;

        }

    }
    void add(int value) {
        var node = new Node(value);
        count++;
        if (head == null) {
            head = node;
        } else {
            var current = head;
            while (current.address != null)
                current = current.address;

            current.address = node;

        }

    }
    void print(){
        var current=head;
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.address;

        }
        System.out.println();
    }
    LLA mergeList(LLA list1,LLA list2){
        Node current=list1.head;
        Node current2=list2.head;
        if(current==null ||  current2==null) {
            if (current==null){
                current=current2;
                return list2;
            }
            else{
                return  list1;
            }

        }
        while(current.address!=null){
            current=current.address;
        }
        current.address=current2;
        return list1;
    }
    void printMergeNodes(LLA list1){
        Node current=list1.head;
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.address;
        }
        System.out.println();
    }
}
