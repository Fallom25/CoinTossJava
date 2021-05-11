package coinToss;

public class CoinToss {
    public CoinToss() {}

    public void displayCoin (int coin) {
        if (coin == 0 ) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }

    public static void main(String[] args) {
        CoinToss coinToss = new CoinToss();
        coinToss.displayCoin(RandomUtils.generateRandom(0,1));
    }
}


