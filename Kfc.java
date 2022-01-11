public class Kfc {

    String name;
    int storage;

    public Kfc(String name) {
        this.name = "KFC";
        this.storage = 0; }

    public void addChicken(int amount) {
        int updateStorage=storage-amount;

        if(updateStorage <= 0) {
            storage+=amount*2;
            System.out.println("Zde je pozadovany pocet kurat " + amount + ".");
            System.out.println("Naskladnit " + amount + " kurat."); }

        storage-=amount;
        System.out.println("Nasklade je " + storage + "kurat.");
        System.out.println("Kolik kurat chcete?"); }

    public void sellChicken(int amount) {
        addChicken(amount); }
}
