
/**
 * Kelas Segitiga digunakan untuk menghitung luas dan keliling segitiga.
 */
public class SegiTiga {
        private double alas;
        private double tinggi;
        private double sisi1;
        private double sisi2;
        private double sisi3;

        /**
         * Konstruktor untuk inisialisasi segitiga dengan panjang alas, tinggi, dan panjang sisi-sisi.
         *
         * @param alas   Panjang alas segitiga.
         * @param tinggi Tinggi segitiga.
         * @param sisi1  Panjang sisi pertama.
         * @param sisi2  Panjang sisi kedua.
         * @param sisi3  Panjang sisi ketiga.
         */
        public SegiTiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
        }

        /**
         * Menghitung luas segitiga.
         *
         * @return Luas segitiga.
         */
        public double hitungLuas() {
            return 0.5 * alas * tinggi;
        }

        /**
         * Menghitung keliling segitiga.
         *
         * @return Keliling segitiga.
         */
        public double hitungKeliling() {
            return sisi1 + sisi2 + sisi3;
        }

        /**
         * Metode untuk mengubah panjang alas segitiga.
         *
         * @param alas Panjang baru untuk alas segitiga.
         */
        public void setAlas(double alas) {
            this.alas = alas;
        }

        /**
         * Metode untuk mengubah tinggi segitiga.
         *
         * @param tinggi Tinggi baru untuk segitiga.
         */
        public void setTinggi(double tinggi) {
            this.tinggi = tinggi;
        }

        /**
         * Metode untuk mengubah panjang sisi pertama segitiga.
         *
         * @param sisi1 Panjang baru untuk sisi pertama segitiga.
         */
        public void setSisi1(double sisi1) {
            this.sisi1 = sisi1;
        }

        /**
         * Metode untuk mengubah panjang sisi kedua segitiga.
         *
         * @param sisi2 Panjang baru untuk sisi kedua segitiga.
         */
        public void setSisi2(double sisi2) {
            this.sisi2 = sisi2;
        }

        /**
         * Metode untuk mengubah panjang sisi ketiga segitiga.
         *
         * @param sisi3 Panjang baru untuk sisi ketiga segitiga.
         */
        public void setSisi3(double sisi3) {
            this.sisi3 = sisi3;
        }

        /**
         * Metode main untuk contoh penggunaan kelas SegiTiga.
         */

    public static void main(String[] args) {
            SegiTiga segitiga = new SegiTiga(5.0, 4.0, 3.0, 4.0, 5.0);

            System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
            System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
            SegiTiga Segitiga = new SegiTiga(5.0, 4.0, 3.0, 4.0, 5.0);
        }
    }
/**
 * Rumus menghitung keliling segitiga=sisi1+sisi2+sisi3=12,0
 * Rumus menghitung luas segitiga L=1/2xalasxtinggi
 */

//ketika ada perintah menambahkan fitur
// /**
// * Metode untuk menentukan jenis segitiga berdasarkan panjang sisi-sisinya.
// *
// * @return Jenis segitiga (segitiga sama sisi, segitiga sama kaki, atau segitiga sembarang).
// */
//public String tentukanJenisSegitiga() {
//    if (sisi1 == sisi2 && sisi2 == sisi3) {
//        return "Segitiga Sama Sisi";
//    } else if (sisi1 == sisi2 || sisi2 == sisi3 || sisi1 == sisi3) {
//        return "Segitiga Sama Kaki";
//    } else {
//        return "Segitiga Sembarang";
//    }
//}
//SegiTiga segitiga = new SegiTiga(5.0, 4.0, 3.0, 4.0, 5.0);
//System.out.println(segitiga.tentukanJenisDanLuasSegitiga());