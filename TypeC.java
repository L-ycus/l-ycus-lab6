import java.util.Random;

public class TypeC extends Thing{
    private int timeSinceLast;

    public TypeC(int r, int c, char l) {
        row = r;
        col = c;
        lab = l;
        timeSinceLast = 0;
    }
    
    public void maybeTurn(Random r) {
        int i = r.nextInt(3);
        int i2 = i*i;
        this.timeSinceLast++;

        if(timeSinceLast == 3) {
            timeSinceLast = 0;
            if(i2 % 4 == 0) {
                rightTurn();
                
            }
            else {
                leftTurn();
            }
        }
        
    }
}
