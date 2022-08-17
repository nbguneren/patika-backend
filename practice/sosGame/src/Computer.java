import java.util.Random;

public class Computer extends Player{

    private int row , col;
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




    void getInput(int size){
        Random rand = new Random();
        row = rand.nextInt(1,size-1);
        col = rand.nextInt(1,size-1);
        boolean o = rand.nextBoolean();

        if(o) {
            ch = "o";
        }else {
            ch = "s";
        }

    }

}
