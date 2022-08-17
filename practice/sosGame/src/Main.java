import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int i = 5;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Board size:");
        i = scan.nextInt();

        String[][] arr = new String[i][i];
        Board board = new Board(arr);

        Random rand = new Random();
        flag = rand.nextBoolean();

        Human human = new Human();
        Computer comp = new Computer();
        Game game = new Game();






        do {
            System.out.println("Player's point: " + human.getPoints());
            System.out.println("Player's point: " + comp.getPoints());
            board.printBoard();
            if (flag){
                game.makeMove(board ,human);
                flag = false;
            }else {
                game.makeMove(board, comp);
                flag = true;
            }

        }while (true);



    }


}
