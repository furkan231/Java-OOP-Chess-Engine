public class Sah extends Tas {

    public Sah(Renk renk, int x, int y) {
        super(renk, x, y);
    }

    @Override
    public boolean gecerliHamleMi(int hedefX, int hedefY, Tas[][] tahta) {
        int farkX = Math.abs(this.x - hedefX);
        int farkY = Math.abs(this.y - hedefY);
        
        // X ve Y eksenindeki değişim 1'den büyük olamaz
        if (farkX <= 1 && farkY <= 1) {
            return true;
        }
        return false;
    }
}