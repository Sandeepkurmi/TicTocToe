class ticTactoe {
    char[][] board;

    public ticTactoe() {
        board = new char[3][3];
        initBoard();
    }

    void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                board[i][j] = ' ';

            }
        }
    }

    void display() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {

                System.out.print(board[i][j] + " | ");

            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int col, char mark) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        } else {
            System.out.print("Invalid position : ");
        }
    }

    String checkColWin() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {

                return "Wow You won the game !";
            }

        }
        return " ";
    }

    String checkRowWin() {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {

                return "Wow You won the game !";
            }

        }
        return " ";
    }

    String checkDaiWin() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
                ||   board[0][2]!=' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return "Wow You won the game !";
        } else {
            return " ";
        }

    }

}

class basicTicTocToe {
    public static void main(String args[]) {
        ticTactoe t = new ticTactoe();
        t.display();
        System.out.print(t.checkColWin());
        System.out.print(t.checkRowWin());
        System.out.print(t.checkDaiWin());

    }
}