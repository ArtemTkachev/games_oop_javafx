package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (HorizCheck(board, i) || VerticalCheck(board, i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean HorizCheck(int[][] board, int row) {
        for (int i = 1; i < board.length; i++) {
            if (board[row][i] != board[row][0]) {
                return false;
            }
        }
        return true;
    }

    private static boolean VerticalCheck(int[][] board, int column) {
        for (int i = 1; i < board.length; i++) {
            if (board[i][column] != board[0][column]) {
                return false;
            }
        }
        return true;
    }

}
