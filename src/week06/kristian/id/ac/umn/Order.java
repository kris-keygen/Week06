package week06.kristian.id.ac.umn;

public class Order {
    private Barang barang;
    private int jumlah;
    private double total;

    public Order(Barang barang, int jumlah, double total) {
        this.barang = barang;
        this.jumlah = jumlah;
        this.total = total;
    }

    public void tampilkanOrder() {
        System.out.println("Pesanan: " + barang.getNama() + " | Jumlah: " + jumlah + " | Total: " + total);
    }
}
