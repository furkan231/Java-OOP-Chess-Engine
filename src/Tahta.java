public class Tahta {
    // 8x8'lik çok boyutlu dizimiz. İçinde 'Tas' objeleri tutacak.
    private Tas[][] izgara;

    public Tahta() {
        izgara = new Tas[8][8];
        dizilimiYap();
    }

    private void dizilimiYap() {
    	// --- BEYAZ TAŞLAR (Alt sıra: Y=0 ve Y=1) ---
        izgara[0][0] = new Kale(Renk.BEYAZ, 0, 0);
        izgara[1][0] = new At(Renk.BEYAZ, 1, 0);
        izgara[2][0] = new Fil(Renk.BEYAZ, 2, 0);
        izgara[3][0] = new Vezir(Renk.BEYAZ, 3, 0);
        izgara[4][0] = new Sah(Renk.BEYAZ, 4, 0);
        izgara[5][0] = new Fil(Renk.BEYAZ, 5, 0);
        izgara[6][0] = new At(Renk.BEYAZ, 6, 0);
        izgara[7][0] = new Kale(Renk.BEYAZ, 7, 0);
        for (int i = 0; i < 8; i++) izgara[i][1] = new Piyon(Renk.BEYAZ, i, 1);

        // --- SİYAH TAŞLAR (Üst sıra: Y=7 ve Y=6) ---
        izgara[0][7] = new Kale(Renk.SIYAH, 0, 7);
        izgara[1][7] = new At(Renk.SIYAH, 1, 7);
        izgara[2][7] = new Fil(Renk.SIYAH, 2, 7);
        izgara[3][7] = new Vezir(Renk.SIYAH, 3, 7);
        izgara[4][7] = new Sah(Renk.SIYAH, 4, 7);
        izgara[5][7] = new Fil(Renk.SIYAH, 5, 7);
        izgara[6][7] = new At(Renk.SIYAH, 6, 7);
        izgara[7][7] = new Kale(Renk.SIYAH, 7, 7);
        for (int i = 0; i < 8; i++) izgara[i][6] = new Piyon(Renk.SIYAH, i, 6);
    }
    public void tasTasi(int eskiX, int eskiY, int yeniX, int yeniY) {
        Tas tas = izgara[eskiX][eskiY];
        izgara[yeniX][yeniY] = tas; 
        izgara[eskiX][eskiY] = null; 
        tas.hareketEt(yeniX, yeniY);}
    
    public void tahtayiYazdir() {
        System.out.println("\n  0 1 2 3 4 5 6 7 (X)");
        for (int y = 7; y >= 0; y--) { // Satranc tahtasi alttan uste dogru okunur (0 en alt)
            System.out.print(y + "|");
            for (int x = 0; x < 8; x++) {
                Tas t = izgara[x][y];
                if (t == null) System.out.print(". ");
                else {
                    String s = t.getClass().getSimpleName().substring(0, 1);
                    System.out.print((t.getRenk() == Renk.BEYAZ ? s.toUpperCase() : s.toLowerCase()) + " ");
                }
            }
            System.out.println();
        }
    }

    public Tas getTas(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) return null;
        return izgara[x][y];
    }
}