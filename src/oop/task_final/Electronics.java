package oop.task_final;

class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String id, String name, double price, int stock, int warrantyMonths) {
        super(id, name, price, stock);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getDescription() {
        return String.format("Электроника: %s, Цена: %.2f, Гарантия: %d мес., В наличии: %d",
                name, price, warrantyMonths, stock);
    }
}

