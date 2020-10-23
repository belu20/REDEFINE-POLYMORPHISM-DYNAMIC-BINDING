public class ContohOverloading {
    public void kurang(int a, int b) {
        System.out.println("Pengurangan 2 angka = "+ (a-b));
    }
    public void kurang(int a, int b, int c) {
        System.out.println("Pengurangan 3 angka = "+ (a-b-c));
    }
    public void kurang(float a, int b) {
        System.out.println("Pengurangan angka tipe data float dengan integer "+ (a-b));
    }
    public void kurang(int a, float b) {
        System.out.println("Pengurangan angka tipe data interger dengan float "+ (a-b));
    }
    public void tambah(int a, int b, int c, int d) {
        System.out.println("pertambahan 2 angka = " + (a + b + c - d));
    }
    public static class unggas {
        void print() {
            System.out.println("print in unggas.");
        }
    }

    public static class mamalia extends unggas {
        @Override
        void print() {
            System.out.println("print in mamalia.");
        }
    }
}


