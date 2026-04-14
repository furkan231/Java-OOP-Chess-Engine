public class Fil extends Tas {

    public Fil(Renk renk, int x, int y) {
        super(renk, x, y);
    }

    @Override
    public boolean gecerliHamleMi(int hedefX, int hedefY, Tas[][] tahta) {
        // Hedef ile mevcut konum arasındaki farkı (mutlak değer olarak) buluyoruz
        int farkX = Math.abs(this.x - hedefX);
        int farkY = Math.abs(this.y - hedefY);
        
        // Çapraz gidişte X ve Y değişimi birbirine eşit olmalıdır
        if (farkX == farkY) {
            return true;
        }
        return false;
    }
}