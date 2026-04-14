public abstract class Tas {
    protected int x;
    protected int y;
    protected Renk renk;

    public Tas(Renk renk, int x, int y) {
        this.renk = renk;
        this.x = x;
        this.y = y;
    }

    // Polimorfizm burada başlıyor! 
    // Her taş bu metodu kendi kurallarına göre yeniden yazmak (override etmek) zorunda.
    public abstract boolean gecerliHamleMi(int hedefX, int hedefY, Tas[][] tahta);

    public void hareketEt(int hedefX, int hedefY) {
        this.x = hedefX;
        this.y = hedefY;
    }

    public Renk getRenk() {
        return renk;
    }
}