import java.util.Scanner;

public class Game {

    public void makeMove(Board board, Player player) {
        boolean isValid = true;
        int row, col;
        String ch;
//        Scanner scanner = new Scanner(System.in);

        do{
            player.getInput(board.getBoardSize());
            row = player.getRow();
            col = player.getCol();
            ch = player.getCh();
            isValid = !board.alterBoard(row, col, ch, player);
            //board.printBoard();
            if (board.moves == board.maxMove) isValid = false;
        }while(isValid);
    }
}
