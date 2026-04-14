public class Piyon extends Tas {

    public Piyon(Renk renk, int x, int y) {
        super(renk, x, y);
    }

    @Override
    public boolean gecerliHamleMi(int hedefX, int hedefY, Tas[][] tahta) {
        // Yön belirleme: Beyazlar Y ekseninde artarak (+1), Siyahlar azalarak (-1) ilerler
        int yon;
        if (this.renk == Renk.BEYAZ) {
            yon = 1;
        } else {
            yon = -1;
        }
        
        // Sadece kendi sütununda (X sabit) ve doğru yönde 1 kare ileri gidebilir
        if (hedefX == this.x && hedefY == this.y + yon) {
            return true;
        }
        return false;
    }
}