package HW.ToyStore;

public class RaffleToys {
    public static void main(String[] args) {
        ListToys lt /*сокрашение от ListToys*/ = new ListToys();

        Toy toy1 = new Toy((byte) 01, "Кукла", (byte) 3, 30.00F);
        Toy toy2 = new Toy((byte) 02, "Машина", (byte) 3, 10.00F);
        Toy toy3 = new Toy((byte) 03, "Пикачу", (byte) 3, 60.00F);
        Toy toy4 = new Toy((byte) 04, "Пазл", (byte) 3, 60.00F);
        Toy toy5 = new Toy((byte) 05, "Lego", (byte) 3, 20.00F);
        Toy toy6 = new Toy((byte) 06, "Пластилин", (byte) 3, 60.00F);
        Toy toy7 = new Toy((byte) 07, "Мяч", (byte) 3, 40.00F);

        lt.addToys(toy1);
        lt.addToys(toy2);
        lt.addToys(toy3);
        lt.addToys(toy4);
        lt.addToys(toy5);
        lt.addToys(toy6);
        lt.addToys(toy7);

        lt.newCOD((byte) 0,99.00F);

        lt.selectToy();

        Toy raffle = lt.gettingToy();
        if (raffle != null) {
            System.out.println("Вы выиграли " + raffle.getName());
        }

        lt.printToys();

    }
}
