package modul;

public class Udara extends Kendaraan {
    private boolean mesin;

    public boolean getMesin() {
        return mesin;
    }

    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }

    public Udara(String nama, int tahunProduksi, boolean mesin) {
        super(nama, tahunProduksi);
        setMesin(mesin);
    }

    public void cetak() {
        super.cetak();
        System.out.print("Mesin\t\t = ");
        if (mesin == true) 
        System.out.println("Jet");
        else {
            System.out.print("Baling-baling");
        }
    }
}
