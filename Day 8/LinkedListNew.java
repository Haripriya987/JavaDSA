import java.util.*;

public class LinkedListNew {

        public static void main(String args[]){
            LinkedList list =new LinkedList();

//            list.addLast(34);
//            list.addFirst(123);
//            list.addFirst(341);
//            list.addLast(23);
//            System.out.println(list.valueOf(4));
//            System.out.println(list.size());
//            list.printNodes();
//            System.out.println(list.nextNode(341));
//            System.out.println(list.prevNode(23));
//            //list.removeFirst();
//            list.addLast(56);
//            list.addLast(34);
//
//            list.middleElement();
//            list.kElement(1);
//            list.reverseKElement(2);
//          //  list.reverse();
//            list.printNodes();
//            list.printMiddle();
//            list.lastIndexOf(34);
//            list.addLast(1);
//            list.addLast(0);
//            list.addLast(1);
//            list.addLast(0);
//         //   list.addLast(1);
//            list.binToDec();
//            list.binToDec2();
//
            //   list=list.createLoop();
            //   System.out.println(list.containsLoop());


        }


}
    class LinkedList{
        Node head;
        Node tail;
        int count=0;
        private class Node{
            int data;
            Node address;
            Node(int data){
                this.data=data;

            }

        }

        void addLast(int value){
            var node=new Node(value);

            if(head==null){
                head=tail=node;
            }
            else {
                tail.address=node;
                tail=node;

            }
            count++;
        }

        void addFirst(int value){
            var node=new Node(value);

            if(head==null){
                head=tail=node;

            }
            else{
                node.address=head;
                head=node;

            }
            count++;
        }
        int size(){
            return count;
        }
        void removeFirst(){
            if(head==null)
                throw new IllegalStateException();
            if(head==tail){
                head=tail=null;
                count--;
            }
            else{
                var temp=head.address;
                head.address=null;
                head=temp;
                count--;
            }

        }
        void removeLast(){
            if(head==null)
                throw new IllegalStateException();
            if(head==tail){
                head=tail=null;
                count--;
            }
            else{
                var curr=head;
                while(curr.address!=null)
                    curr=curr.address;

                curr.address=null;
                tail=curr;
                count--;
            }

        }
        boolean isEmpty(){
            if(head==null)
                return true;
            return false;
        }
        boolean contains(int value){
            if(isEmpty())
                throw new IllegalStateException();
            var curr=head;
            int index=0;
            while(curr!=null){
                if(curr.data==value)
                    return true;
                index++;
                curr=curr.address;

            }
            return false;
        }
        int valueOf(int index){
            int no=1;
            if(index<=count) {
                var newNode=head;
                while (no <= index) {
                    if(no==index)
                        return newNode.data;
                    newNode=newNode.address;
                    no++;
                }
            }
            return -1;
        }
        void printNodes(){
            var curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.address;
            }
            System.out.println();
        }
        int nextNode(int value){
            if(contains(value)){

                var curr=head;
                var next=curr.address;
                if(next.data==value)
                    return -1;
                while(next!=null){
                    if(curr.data==value)
                        return next.data;
                    next=next.address;
                    curr=curr.address;
                }
            }
            return -1;
        }
        int prevNode(int value){
            if(contains(value)){
                var curr=head;
                var next=curr.address;
                if(curr.data==value)
                    return -1;
                while(curr!=null){
                    if(next.data==value)
                        return curr.data;
                    next=next.address;
                    curr=curr.address;
                }

            }
            return -1;
        }
        //without using size()
        void printMiddle(){
            if(head==null)
                throw new IllegalStateException("No element is present in linked list");
            if(head==tail) {
                System.out.println(head.data);
                return;
            }
            Node slow=head;
            Node fast=head;
            while(fast!=tail && fast.address!=tail){
               fast=fast.address.address;
               slow=slow.address;
            }
            System.out.print(slow.data + " ");
            if(fast.address==tail)
                System.out.println(slow.address.data);


        }
        void middleElement(){
            int s=size();
            int x=s/2;
            int y=x-1;
            if(s==0 )
                throw new IllegalStateException();
            if(s==1)
                System.out.println(head.data);
            if(s%2!=0){
                var curr=head;
                int index=0;
                while(curr!=null && index<=x){
                    if(index==x){
                        System.out.println(curr.data);
                    }
                    index++;
                    curr=curr.address;
                }
            }
            else{
                var curr=head;
                int index=0;
                var next=head.address;
                while(next!=null && index<=x){
                    if(index==y){
                        System.out.println(curr.data +" "+next.data);
                    }
                    index++;
                    curr=curr.address;
                    next=next.address;
                }
            }

        }
        void kElement(int k){
            int s=size();
            if(k<=s && k>0){
                var curr=head;
                int index=1;
                while(curr!=null && index<=k){
                    if(index==k){
                        System.out.println(curr.data);
                    }
                    index++;
                    curr=curr.address;
                }
            }
        }
        void reverse(){
            if(head==null)
                System.out.println("List is empty");

            var current=head.address;
            var  previous=head;
            while(current!=null){
                var next=current.address;
                current.address=previous;
                previous=current;

                current=next;
            }
            tail=head;
            tail.address=null;
            head=previous;
        }
        void reverseKElement(int value){
            int reverse=size()-value+1;
            if(value>size() || value<0)
                System.out.println("Not possible");
            else {
                System.out.print("" );
                kElement(reverse);
            }
        }
     void lastIndexOf(int value){
       if(contains(value)) {
           int index=-1;
           var current=head;
           int start=0;
           while(current!=null){
                if (current.data==value)
                    index=start;

                start++;
                current=current.address;
           }
           System.out.println(index);


       }
       else
           throw new IllegalStateException("Value is not present in list");
     }
     void binToDec(){
            var current=head;
            int result=0;
            while(current!=null){
                result=result*2+current.data;

                current=current.address;
            }
            System.out.println(result);

     }
     void binToDec2(){
          int s=size();
         var current=head;
         int result=0;
         while(current!=null){
             result += current.data * Math.pow(2, s - 1);

             s--;
             current=current.address;
         }
         System.out.println(result);

     }
     static LinkedList createLoop(){
            LinkedList li=new LinkedList();
            li.addLast(10);
            li.addLast(20);

            li.addLast(50);
            li.addLast(60);
         var temp=li.head.address;
            li.tail.address=temp;

            return li;

        }
    boolean containsLoop(){
            var current=head;
            Set<Node>  set=new HashSet<>();
            while(current!=null){
                if(set.contains(current))
                    return  true;

                set.add(current);
                current=current.address;
            }
            return false;
    }


    }
