package modul;

public class Pesawat extends Udara{
    private int muatan;

    public int getMuatan() {
        return muatan;
    }

    public void setMuatan(int muatan) {
        this.muatan = muatan;  
    }

    public Pesawat() {
    }

    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan) {
        super(nama, tahunProduksi, mesin);
        setMuatan(muatan);
    }

    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan) {
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }

    public String katergori(int muatan) {
        if (muatan <= 100) 
        return "Mini";
        else if (muatan <= 200) 
        return "Sedang";
        else 
        return "Besar";
    }

    public void cetak () {
        super.cetak();
        System.out.println("Muatan\t\t = " + muatan + " orang");
        System.out.println("Kategori\t\t = " + kategor(muatan));
    }
}
