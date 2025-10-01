package week06.kristian.id.ac.umn;

public class Handphone extends Barang {
    private int stok;

    public Handphone(String id, String nama, double harga, int stok) {
        super(id, nama, harga);
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + id + " | Handphone: " + nama + " | Harga: " + harga + " | Stok: " + stok);
    }
}