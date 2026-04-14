public class At extends Tas {

    public At(Renk renk, int x, int y) {
        super(renk, x, y);
    }

    @Override
    public boolean gecerliHamleMi(int hedefX, int hedefY, Tas[][] tahta) {
        int farkX = Math.abs(this.x - hedefX);
        int farkY = Math.abs(this.y - hedefY);

        // L şeklindeki hareketin kontrolü
        if ((farkX == 2 && farkY == 1) || (farkX == 1 && farkY == 2)) {
            return true;
        }
        return false;
    }
}