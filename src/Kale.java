public class Kale extends Tas {

    public Kale(Renk renk, int x, int y) {
        // Üst sınıfın (Tas) constructor'ını çağırıyoruz
        super(renk, x, y); 
    }

    @Override
    public boolean gecerliHamleMi(int hedefX, int hedefY, Tas[][] tahta) {
        // Kural: Kale sadece yatay veya dikey gidebilir.
        // Yani hedefin X'i benim X'ime eşit olmalı VEYA hedefin Y'si benim Y'ime eşit olmalı.
        if (this.x == hedefX || this.y == hedefY) {
            
            // Not: Şimdilik arada başka taş var mı (üzerinden atlama durumu) 
            // kontrolünü sonraya bırakıyoruz. Önce temel mantık!
            return true; 
        }
        return false;
    }
}