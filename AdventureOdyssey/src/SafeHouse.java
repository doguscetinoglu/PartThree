public class SafeHouse extends NormalLoc {

    SafeHouse(Player player) {
        super(player, "Maradon");
    }

    public boolean getLocation() {
        if(player.getInv().isFood() && player.getInv().isFirewood() && player.getInv().isWater()) {
            System.out.println();
            System.out.println("Tebrikler oyunu tamamladınız.");
            return false;
        }

        player.setHealthy(player.getrHealthy());
        System.out.println("İyileştiniz...");
        System.out.println("Şuan Maradon Haritasındasınız.");
        return true;
    }

}