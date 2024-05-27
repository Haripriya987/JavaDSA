package LinkedListFolder;


public class PalindromeList {
  LinkedListDemo head;

  public class LinkedListDemo {
    public int data;
    public LinkedListDemo next;
  
    LinkedListDemo(int data){
        this.data=data;
        this.next=null;
    }
    
  }

  public void insertAtHead(LinkedListDemo node){
    if(this.head==null){
      this.head=node;
    }
    else{
      node.next=this.head;
      this.head=node;
    }

  }
 
  public void createLinkedList(int[] li){
    for(int i=li.length-1;i>=0;i--){
      LinkedListDemo node=new LinkedListDemo(li[i]);
      insertAtHead(node);
    }
  }


  public  boolean ispalindrome(LinkedListDemo head){

    if(head==null || head.next==null)
    return true;

    LinkedListDemo slow=head;
    LinkedListDemo fast=head;

    while(fast.next!=null && fast.next.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }

    LinkedListDemo firstHalf=head;
    LinkedListDemo secondHalf=reverseLinkedList(slow.next);

    LinkedListDemo copyOfSecondHalf = secondHalf; // To restore later

    while(secondHalf!=null){
      if(firstHalf.data!=secondHalf.data){
      slow.next = reverseLinkedList(copyOfSecondHalf);
      return false;

      }

      secondHalf=secondHalf.next;
      firstHalf=firstHalf.next;
    }
    slow.next = reverseLinkedList(copyOfSecondHalf);



    return true;

  }
  public LinkedListDemo reverseLinkedList(LinkedListDemo start){
    LinkedListDemo prev=null;
    LinkedListDemo next=null;
    LinkedListDemo curr=start;

    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
  
    return prev;

  }

  public static void main(String args[]){

    int arr[]={1,2,3,4,3,2,1};
    PalindromeList pl=new PalindromeList();
    pl.createLinkedList(arr);
    System.out.println(pl.ispalindrome(pl.head));    


  }
}
