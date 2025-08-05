import java.util.LinkedList;
import java.util.Queue;

public class implement_stack_using_queues_225 {
    Queue<Integer> q;
    Queue<Integer> temp;

    public MyStack() {
        q = new LinkedList<>();
        temp = new LinkedList<>();
    }

    public void push(int x) {

        while(!q.isEmpty()){
            temp.offer(q.poll());
        }
        q.offer(x);
        while(!temp.isEmpty()){
            q.offer(temp.poll());
        }

    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

//class MyStack {
//
//    Queue<Integer> q;
//
//    public MyStack() {
//        q = new LinkedList<>();
//    }
//
//    public void push(int x) {
//        q.offer(x);
//        int size = q.size();
//        // 將前面的元素轉到後面去，讓新加的元素在前面（模擬 stack）
//        while (size-- > 1) {
//            q.offer(q.poll());
//        }
//    }
//
//    public int pop() {
//        return q.poll(); // stack 頂端就是 queue 頭
//    }
//
//    public int top() {
//        return q.peek();
//    }
//
//    public boolean empty() {
//        return q.isEmpty();
//    }
//}
