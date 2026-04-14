public class Vezir extends Tas {

    public Vezir(Renk renk, int x, int y) {
        super(renk, x, y);
    }

    @Override
    public boolean gecerliHamleMi(int hedefX, int hedefY, Tas[][] tahta) {
        int farkX = Math.abs(this.x - hedefX);
        int farkY = Math.abs(this.y - hedefY);

        // Kalenin gidiş mantığı (Düz)
        boolean duzGidis = (this.x == hedefX || this.y == hedefY);
        
        // Filin gidiş mantığı (Çapraz)
        boolean caprazGidis = (farkX == farkY);

        // İkisinden biri uyuyorsa hamle geçerlidir
        if (duzGidis || caprazGidis) {
            return true;
        }
        return false;
    }
}