public class SoreMain {

    public static void main(String[] args) {

        Store krumpliStore = new Store ("krumpli", 5);
        Store repaSore = new Store ("répa", 8);

        krumpliStore.store(6);
        System.out.println("A krumpli raktárban tárolt mennyisége " + krumpliStore.getStock() + " tonna.");

    }
}
