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
        Game game = new Game();






        do {
            if (true){
                game.makeMove(board ,human, scan);
            }
        }while (true);



    }


}
