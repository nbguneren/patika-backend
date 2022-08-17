public class Board {
    private String[][] board;
    private int boardSize;
    public int moves = 0, maxMove = boardSize*boardSize;


    public int getBoardSize() {
        return boardSize;
    }

    public void printBoard(){
        for (String[] rows: board) {
            for (String spot: rows) {
                System.out.print(spot + " ");

            }
            System.out.print("\n");
        }
    }

    public boolean alterBoard(int row, int col, String ch, Player player){
        if (board[row-1][col-1].equals("-")){
            if (ch.toLowerCase().equals("s") || ch.toLowerCase().equals("o")){
                board[row-1][col-1] = ch;
                checkPoint(row, col, ch, player);
                moves += 1;
                return true;
            }else{
                System.out.println("You can only insert 's' or 'o'.");
                return false;
            }
        }else{
            System.out.println("You can not overwrite to a spot.");
            return false;
        }
    }

    public void flushBoard(){
        for (int i = 0; i < this.board.length; i++){
            for (int j = 0; j < this.board[0].length; j++){
                board[i][j] = "-";
            }
        }
    }

    public void checkPoint(int row, int col, String ch, Player player){
        String temp = "";
        int point = player.getPoints();
        if(ch.equals("o")){
            if (col < board[row-1].length && col-1 > 0){
                temp = board[row-1][col-2] + "o" + board[row-1][col];
                if(temp.equals("sos")) point += 1;
                if(row < board.length && row-1 > 0){
                    temp = board[row-2][col-2] + "o" + board[row][col];
                    if (temp.equals("sos")) point +=1;

                    temp = board[row-2][col] + "o" + board[row][col-2];
                    if (temp.equals("sos")) point +=1;

                    temp = board[row-2][col-1] + "o" + board[row][col-1];
                    if (temp.equals("sos")) point +=1;
                }
            }else if(row < board[row-1].length && row > 0){
                temp = board[row-2][col-1] + "o" + board[row][col-1];
                if(temp.equals("sos")) point += 1;
            }
        }else {
            if(row < board.length-1 && row-2 > 0){
                //üst
                temp = "s" + board[row-2][col-1] + board[row-3][col-1];
                if(temp.equals("sos")) point += 1;

                //alt
                temp = "s" + board[row][col-1] + board[row+1][col-1];
                if(temp.equals("sos")) point += 1;

                if(col < board.length-1){
                    //sağ
                    temp = "s" + board[row-1][col] + board[row-1][col+1];
                    if(temp.equals("sos")) point += 1;

                    //sağ üst çapraz
                    temp = "s" + board[row-2][col] + board[row-3][col-1];
                    if(temp.equals("sos")) point += 1;

                    //sağ alt çapraz
                    temp = board[row+1][col+1] + board[row][col] + "s";
                    if(temp.equals("sos")) point += 1;
                }

                if(col-2 > 0){
                    //sol
                    temp = board[row-1][col-3] + board[row-1][col-2] + "s";
                    if(temp.equals("sos")) point += 1;

                    //sol üst çapraz
                    temp = "s" + board[row-2][col-2] + board[row-3][col-3];
                    if(temp.equals("sos")) point += 1;

                    //sol alt çapraz
                    temp = board[row+1][col-3] + board[row][col-2] + "s";
                    if(temp.equals("sos")) point += 1;
                }

            }else if (row-2 > 0){
                //üst
                temp = "s" + board[row-2][col-1] + board[row-3][col-1];
                if(temp.equals("sos")) point += 1;

                if (col < board.length-1){
                    //sağ
                    temp = "s" + board[row-1][col] + board[row-1][col+1];
                    if(temp.equals("sos")) point += 1;

                    //sağ üst çapraz
                    temp = "s" + board[row-2][col] + board[row-3][col-1];
                    if(temp.equals("sos")) point += 1;

                }

                if (col-2 > 0){
                    //sol
                    temp = board[row-1][col-3] + board[row-1][col-2] + "s";
                    if(temp.equals("sos")) point += 1;

                    //sol üst çapraz
                    temp = "s" + board[row-2][col-2] + board[row-3][col-3];
                    if(temp.equals("sos")) point += 1;
                }
            }else {
                //alt
                temp = "s" + board[row][col-1] + board[row+1][col-1];
                if(temp.equals("sos")) point += 1;

                if(col < board.length-1){
                    //sağ
                    temp = "s" + board[row-1][col] + board[row-1][col+1];
                    if(temp.equals("sos")) point += 1;

                    //sağ alt çapraz
                    temp = board[row+1][col+1] + board[row][col] + "s";
                    if(temp.equals("sos")) point += 1;
                }

                if(col-2 > 0){
                    //sol
                    temp = board[row-1][col-3] + board[row-1][col-2] + "s";
                    if(temp.equals("sos")) point += 1;

                    //sol alt çapraz
                    temp = board[row+1][col-3] + board[row][col-2] + "s";
                    if(temp.equals("sos")) point += 1;
                }
            }

        }
        player.setPoints(point);
    }

    public Board(String[][] board) {
        this.board = board;
        flushBoard();
        boardSize = this.board.length;
    }
}
