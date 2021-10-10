public class Store {

    private String product;
    private int stock;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Store(String product, int stock) {
        this.product = product;
        this.stock = stock;
    }

    public int store (int amount) {
        stock = getStock() + amount;
        return stock;
    }

    public int dispatch (int amount) {
        stock = getStock() - amount;
        return stock;
    }
}
