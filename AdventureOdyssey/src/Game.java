import java.util.Scanner;
// Game sınıfı, oyunun temel işleyişini kontrol eder.
public class Game {
    // Oyuncu ve mekan değişkenleri.
    Player player;
    Location location;
    // Kullanıcı girişini almak için bir Scanner nesnesi.
    Scanner scan = new Scanner(System.in);

    // Kullanıcının oyuna giriş yaptığı metod.
    public void login() {
        // Kullanıcıya hoşgeldin mesajı göster.
        System.out.println("Adventure Odyssey Oyununa Hoşgeldiniz !");
        // Kullanıcıdan ismini al.
        System.out.println("Oyuna başlamadan önce isminizi giriniz : ");
        String playerName = scan.nextLine();
        // Oyuncu nesnesini oluştur.
        player = new Player(playerName);
        // Karakter seçme metodunu çağır.
        player.selectCha();
        // Oyunu başlat.
        start(scan);
    }

    // Oyunu başlatan metod.
    public void start(Scanner scan) {
        // Sonsuz döngü ile oyun devam eder.
        while (true) {
            System.out.println();
            System.out.println("=================================================");
            System.out.println();
            // Kullanıcıya mekan seçeneklerini göster.
            System.out.println("Işınlanacağınız Bir Harita Seçiniz : ");
            System.out.println("1. Maradon --> Size ait güvenli bir mekan, düşman yok !");
            System.out.println("2. Border Defance War --> Karşınıza belki zombi çıkabilir !");
            System.out.println("3. Juraid Mountain --> Karşınıza belki vampir çıkabilir !");
            System.out.println("4. Colony Zone --> Karşınıza belki ayı çıkabilir !");
            System.out.println("5. Death Valley --> Karşınıza belki yılan çıkabilir !");
            System.out.println("6. Power Up Store --> Silah veya Zırh alabilirsiniz!");
            System.out.print("Işınlanmak İstediğiniz yer : ");
            // Kullanıcının seçimini al.
            int selLoc = scan.nextInt();
            // Geçerli bir mekan seçeneği girilene kadar kullanıcıdan giriş iste.
            while (selLoc < 0 || selLoc > 6) {
                System.out.print("Lütfen geçerli bir harita seçiniz : ");
                selLoc = scan.nextInt();
            }

            // Kullanıcının seçtiği mekana göre ilgili mekan nesnesini oluştur.
            if (selLoc == 1) {
                location = new SafeHouse(player);
            } else if (selLoc == 2) {
                if (player.getInv().isFood()) {
                    System.out.println("Bu haritayı zaten temizlediniz. Tekrar giremezsiniz!");
                    continue;
                }
                location = new Cave(player);
            } else if (selLoc == 3) {
                if (player.getInv().isFirewood()) {
                    System.out.println("Bu haritayı zaten temizlediniz. Tekrar giremezsiniz!");
                    continue;
                }
                location = new Forest(player);
            } else if (selLoc == 4) {
                if (player.getInv().isWater()) {
                    System.out.println("Bu haritayı zaten temizlediniz. Tekrar giremezsiniz!");
                    continue;
                }
                location = new River(player);
            } else if (selLoc == 5) {
                location = new Mine(player);
            } else if (selLoc == 6) {
                location = new ToolStore(player);
            } else {
                location = new SafeHouse(player);
            }

            // Eğer güvenli ev seçilmişse ve oyuncu tüm ödülleri toplamışsa, oyunu kazandı.
            if (location.getClass().getName().equals("SafeHouse")) {
                if (player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
                    System.out.println("Tebrikler Oyunu Kazandınız !");
                    if (scan != null) scan.close();
                    break;
                }
            }
            // Mekanın işlevini gerçekleştir.
            if (!location.getLocation()) {
                System.out.println("Oyun Bitti !");
                if (scan != null) scan.close();
                break;
            }

        }
    }
}