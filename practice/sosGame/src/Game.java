import java.util.Scanner;

public class Game {

    public void makeMove(Board board, Human human, Scanner scanner) {
        boolean isValid = true;
        int row, col;
        String ch;
//        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        do{
            human.getInput(scanner);
            row = human.getRow();
            col = human.getCol();
            ch = human.getCh();
            isValid = !board.alterBoard(row, col, ch, human);
        }while(isValid);
    }
}
