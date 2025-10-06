import java.util.Random;

public class TypeA extends Thing {
    public TypeA(int r, int c) {
        row = r;
        col = c;
        //lab = l;
    }
    
    public void maybeTurn(Random r) {
        int i = r.nextInt(3);

        if (i == 1) {
            rightTurn();
        }

        if (i == 2) {
            leftTurn();
        }
    }
}
