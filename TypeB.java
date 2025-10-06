import java.util.Random;

public class TypeB extends Thing{
    private int timeSinceLast;

    public TypeB(int r, int c, char l) {
        row = r;
        col = c;
        lab = l;
        timeSinceLast = 0;
    }
    
    public void maybeTurn(Random r) {
        int i = r.nextInt(3);
        this.timeSinceLast++;

        if (this.timeSinceLast == 10) {
            this.timeSinceLast = 0;

            if (i == 1) {
            rightTurn();
            }

            if (i == 2) {
            leftTurn();
            }
        }

    }
}
