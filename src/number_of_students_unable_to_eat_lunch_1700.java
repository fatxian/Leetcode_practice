import java.util.LinkedList;
import java.util.Queue;

public class number_of_students_unable_to_eat_lunch_1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<>();

        int count = students.length;
        for (int i = 0; i < count; i++) {
            studentsQueue.offer(students[i]);
        }

        for(int i = 0; i < sandwiches.length; i++) {
            int n = 0;
            while(n<count&&studentsQueue.peek()!=sandwiches[i]){
                studentsQueue.offer(studentsQueue.poll());
                n++;
            }

            if(studentsQueue.peek()==sandwiches[i]){
                count--;
                studentsQueue.poll();
            }else{
                break;
            }
        }
        return count;
    }
}

//class Solution {
//    public int countStudents(int[] students, int[] sandwiches) {
//        int[] count = new int[2]; // count[0] = 喜歡圓形的學生數, count[1] = 喜歡方形的學生數
//
//        for (int s : students) {
//            count[s]++;
//        }
//
//        for (int i = 0; i < sandwiches.length; i++) {
//            int type = sandwiches[i];
//            if (count[type] == 0) {
//                // 沒人要這個三明治，直接回傳剩下學生數
//                return sandwiches.length - i;
//            }
//            count[type]--; // 有人要，發出去
//        }
//
//        return 0; // 所有學生都吃到了
//    }
//}