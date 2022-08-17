import java.util.Scanner;

public class Human extends Player{
    private int row, col;
    private String ch;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }
    /*
        @Override
        void makeMove(Board board, Human human) {
            boolean isValid = true;
            Scanner scanner = new Scanner(System.in);
            do{
                getInput(scanner);
                isValid = !board.alterBoard(row, col, ch, human);
                //todo
            }while(isValid);
        }
    */
    void parser(String input){
        row = Character.getNumericValue(input.charAt(0));
        col = Character.getNumericValue(input.charAt(2));
        ch = input.substring(4);
    }

    void getInput(Scanner scanner){
        String input;
        System.out.print("Enter spot and your move(like '2 2 s'):");
        input = scanner.nextLine();
        parser(input);
    }

}
