import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tahta oyun = new Tahta();
        Scanner sc = new Scanner(System.in);

        while (true) {
            oyun.tahtayiYazdir();
            System.out.println("Hamle Gir (MevcutX MevcutY HedefX HedefY) veya 'cikis':");
            String input = sc.nextLine();

            if (input.equals("cikis")) break;

            try {
                String[] p = input.split(" ");
                int x1 = Integer.parseInt(p[0]), y1 = Integer.parseInt(p[1]);
                int x2 = Integer.parseInt(p[2]), y2 = Integer.parseInt(p[3]);

                Tas secilen = oyun.getTas(x1, y1);

                if (secilen != null && secilen.gecerliHamleMi(x2, y2, null)) {
                    oyun.tasTasi(x1, y1, x2, y2);
                    System.out.println("\n>>> BASARILI: " + secilen.getClass().getSimpleName() + 
                                       " (" + x1 + "," + y1 + ") noktasindan (" + x2 + "," + y2 + ") noktasina tasindi.");
                } else {
                    System.out.println("\n!!! HATA: Gecersiz hamle veya bos kare secimi.");
                }
            } catch (Exception e) {
                System.out.println("Giris formati hatali!");
            }
        }
    }
}