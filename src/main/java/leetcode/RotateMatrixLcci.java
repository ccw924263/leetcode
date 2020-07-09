package leetcode;

/**
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 *
 * 不占用额外内存空间能否做到？
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]	insert … on duplicate key update
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-matrix-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RotateMatrixLcci {

    static class Solution {
        public static void main(String[] args) {
            int[][] matrix = new int[][]{{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
            int[][] result = rotate(matrix);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    System.out.print(result[i][j] + ",");
                }
            }
        }
        public static int[][] rotate(int[][] matrix) {
            int count = matrix.length;
            int[][] result = new int[count][count];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    int num = matrix[i][j];
                    if(i <= count / 2){
                        result[i][count - 1 - j] = num;
                    }else{
                        result[i][count - 1 - j] = num;
                    }
                }
            }
            return result;
        }
    }

}

























