package HW.ToyStore;

public class Toy {

    // создание полей класса
    private byte id;
    private String name;
    private byte quantity;
    private float chanceOfDrop;

    // Конструктор класса, чтоб можно было обращаться к приватному доступу
    public Toy(byte id, String name, byte quantity, float chanceOfDrop) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chanceOfDrop = chanceOfDrop;
    }

    //геттеры/сеттеры
    public byte getId() {
        return id;
    }

    public void setQuantity(byte quantity) {
        this.quantity = quantity;
    }

    public void setChanceOfDrop(float chanceOfDrop) {
        this.chanceOfDrop = chanceOfDrop;
    }

    public String getName() {
        return name;
    }

    public byte getQuantity() {
        return quantity;
    }

    public float getChanceOfDrop() {
        return chanceOfDrop;
    }
}
