class Solution {
    public boolean exist(char[][] board, String word) {

        char arr[] = word.toCharArray();
        Arrays.sort(arr);

        int rows = board.length;
        int cols = board[0].length;

        char arr1[] = new char[rows * cols];

        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[k++] = board[i][j];
            }
        }

        Arrays.sort(arr1);

        int count = 0;
        int j = 0;

        for (int i = 0; i < arr1.length && j < arr.length; i++) {
            if (arr1[i] == arr[j]) {
                count++;
                j++;
            }
        }

        if(count==word.length()) return true; 
        else return false; 
    }
}