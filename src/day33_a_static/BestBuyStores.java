package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy store1 = new BestBuy("Fairfax");
        BestBuy store2 = new BestBuy("McClean");
        BestBuy store3 = new BestBuy("Falls Church");
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println(store1.headQuarter);
        System.out.println(store2.headQuarter);
        System.out.println(store3.headQuarter);
    }
}
