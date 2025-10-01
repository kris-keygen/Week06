package week06.kristian.id.ac.umn;

public class Voucher extends Barang {
    private double pajak;

    public Voucher(String id, String nama, double harga, double pajak) {
        super(id, nama, harga);
        this.pajak = pajak;
    }

    public double hitungHargaDenganPajak() {
        return harga + (harga * pajak);
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + id + " | Voucher: " + nama + " | Harga: " + harga + " | Pajak: " + (pajak * 100) + "%");
    }
}