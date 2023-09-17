public class LListAssignment {
    public static void main(String[] args){
        LLA list1=new LLA();
       list1.add(32);
        list1.add(1);
        list1.add(46);
        list1.add(45);
        list1.add(12);
        list1.add(9);
       list1.add(90);
        list1.seggregate(list1.head);

//        list1.print();
//        list1.reverseKElements(4);
//        list1.print();
//        System.out.println(list1.count);
//        LLA list2=new LLA();
//        list2.add(3);
//        list2.add(56);
//        list2.print();
//        LLA l=new LLA();
//        LLA merge = l.mergeList(list1, list2);
//        l.printMergeNodes(merge);


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
    void reverseKElements(int k){
        if(head==null || k>count){
            return;
        }


        Node current=head;
        for(int i=1;i<=k;i++){
            if(current==null)
                return;

           current=current.address;

        }
        var dummy=current;

        Node cur=head.address;
        Node prev=head;
        int i=1;
        while( i<k){
            var next=cur.address;
            cur.address=prev;
            prev=cur;

            cur=next;
            i++;
        }
        head.address=dummy;
        head=prev;


    }
void reverseKTimes(int k){
    if(head==null || k>count){
        return;
    }

    Node current=head;
    int i=1;
    for( i=1;i<=k;i++){
        if(current==null)
            return;

        current=current.address;

    }
    var dummy=current;
    if(i==1){
    Node cur=head.address;
    Node prev=head;
    int j=1;
    while( i<k){
        var next=cur.address;
        cur.address=prev;
        prev=cur;

        cur=next;
        j++;
    }

        head.address = dummy;
        head = prev;
    }

    }
    void Traverse(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.address;
        }
    }
    void seggregate(Node head){
    Node eH=null,eT=null,oH=null,oT=null;
    Node temp=head;
    while(temp!=null){
        if(temp.data%2==0){
            if(eH==null){
                eH=eT=temp;
            }
            else{
                eT.address=temp;
                eT=temp;
            }

        }else{
            if(oH==null){
                oH=oT=temp;
            }
             else {
                oT.address = temp;
                oT=temp;
            }
        }
        temp=temp.address;
    }
    if(eH!=null && oH!=null){
        eT.address=oH;
        oT.address=null;
        Traverse(eH);

    }
    else {
        Traverse(head);
    }
    }

}
