import java.util.Random;

abstract class Thing {
    protected int  row;
    protected int col;
    protected int dir;
    protected char lab = 'r';

    public void rightTurn() {
        this.dir = (this.dir + 1) % 4;
    }

    public void leftTurn() {
        this.dir = (this.dir + 3) % 4;
    }

    public abstract void maybeTurn(Random r);

    public void step() {
        final int[] dc = { 0, 1, 0, -1}, dr = {1, 0, -1, 0};
        this.row += dr[this.dir];
        this.col += dc[this.dir];
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public char getLab() {
        return lab;
    }
    
}