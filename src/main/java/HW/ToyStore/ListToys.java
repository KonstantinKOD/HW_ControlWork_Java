package HW.ToyStore;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ListToys {
    private LinkedList<Toy> toys; // инициализация списка игрушек
    private LinkedList<Toy> prize; // инициализвция списка выигрышных игрушек
    private String issuedToys; // поле с ссылкой на файл выданных игрушек

    public ListToys() { // метот создания списков
        toys = new LinkedList<Toy>(); // список игрушек
        prize = new LinkedList<Toy>(); // список выигрышных игрушек
        issuedToys = "prize.txt"; // создание текстого файла под список выигронных игрушек
    }

    public void addToys(Toy toy) { // метод добавления новых игрушек
        toys.add(toy);
    }

    public void newCOD /*COD от ChanceOfDrop*/(byte id, float newChanceOfDrop) { // метод назначения новой вероятности выподения
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setChanceOfDrop(newChanceOfDrop);
            }
        }
    }

    public void selectToy(){ // метод определяет выигрышную игрушку
        for (Toy toy: toys) {
            double rand = Math.random() * 100; // задать шанс выподения
            if (rand < toy.getChanceOfDrop()){
                prize.add(toy);
            }
        }
    }

    // метод для полученимя игрушки и записии ее в файл
    public Toy gettingToy() {
        if (!prize.isEmpty()){
            Toy raffle = prize.remove(0);
            raffle.setQuantity((byte) (raffle.getQuantity()-1));

            try {
                FileWriter writer = new FileWriter(issuedToys, true);
                writer.write(raffle.getName() + " (" + raffle.getId() + ")\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл");
            }

            return raffle;

        } else {
            System.out.println("Кончились игрушки");
            return null;
        }
    }


    // печать в консоли списка всех игрушек
    public void printToys() {
        for (Toy toy : toys) {
            System.out.println(toy.getName() + " (" + toy.getId() + "), qty:" +
                    toy.getQuantity() + ", freq: " + toy.getChanceOfDrop()+"%");
        }
    }
}