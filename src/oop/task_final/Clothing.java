package oop.task_final;

// Класс Clothing
class Clothing extends Product {
    private String size;

    public Clothing(String id, String name, double price, int stock, String size) {
        super(id, name, price, stock);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return String.format("Одежда: %s, Размер: %s, Цена: %.2f, В наличии: %d",
                name, size, price, stock);
    }
}
