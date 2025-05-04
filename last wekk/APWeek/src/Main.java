public class Main {
    public static void main(String[] args) {

        Potion p1 = new Potion("ASD", 2);
        Potion p2 = new Potion("DS", 2);
        Potion p3 = new Potion("ASD", 2);

        Vial v = new Vial();

        v.addPotion(p1);
        v.addPotion(p2);
        v.addPotion(p1);

        System.out.println(v.count());
    }
}