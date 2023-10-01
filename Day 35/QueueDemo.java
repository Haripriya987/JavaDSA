import java.util.*;
public class QueueDemo {
    public static void main(String args[]){
        ArrayDeque<Integer> que=new ArrayDeque<>();
        que.add(32);
        que.add(438);
        que.add(90);
        que.add(78);
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que);
    }
}
