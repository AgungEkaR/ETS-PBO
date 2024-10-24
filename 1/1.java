class Hewan {
    String nama;
    int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String suara() {
        return "Hewan bersuara";
    }
}

class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public String suara() {
        return "Meong";
    }
}

class Anjing extends Hewan {
    String ukuran;

    public Anjing(String nama, int umur, String ukuran) {
        super(nama, umur);
        this.ukuran = ukuran;
    }

    @Override
    public String suara() {
        return "Guk guk";
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Kitty", 2, "Persia");
        Anjing anjing1 = new Anjing("Buddy", 3, "Sedang");

        System.out.println(kucing1.nama + " mengeluarkan suara: " + kucing1.suara());
        System.out.println(anjing1.nama + " mengeluarkan suara: " + anjing1.suara());
    }
}
