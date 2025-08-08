public class search_a_2D_matrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length;
        int m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (matrix[m][0] <= target) {
                l = m + 1;
            } else{
                r = m;
            }
        }
        if(l-1<0)return false;
        for (int i = 0; i < matrix[l-1].length; i++) {
            if (matrix[l-1][i] == target) {
                return true;
            }
        }
        return false;
    }
}

//public boolean searchMatrix(int[][] matrix, int target) {
//    int m = matrix.length, n = matrix[0].length;
//    int l = 0, r = m * n - 1;
//    while (l <= r) {
//        int mid = l + (r - l) / 2;
//        int val = matrix[mid / n][mid % n];
//        if (val == target) return true;
//        if (val < target) l = mid + 1;
//        else r = mid - 1;
//    }
//    return false;
//}

//public class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int ROWS = matrix.length;
//        int COLS = matrix[0].length;
//
//        int top = 0, bot = ROWS - 1;
//        while (top <= bot) {
//            int row = (top + bot) / 2;
//            if (target > matrix[row][COLS - 1]) {
//                top = row + 1;
//            } else if (target < matrix[row][0]) {
//                bot = row - 1;
//            } else {
//                break;
//            }
//        }
//
//        if (!(top <= bot)) {
//            return false;
//        }
//        int row = (top + bot) / 2;
//        int l = 0, r = COLS - 1;
//        while (l <= r) {
//            int m = (l + r) / 2;
//            if (target > matrix[row][m]) {
//                l = m + 1;
//            } else if (target < matrix[row][m]) {
//                r = m - 1;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
//}