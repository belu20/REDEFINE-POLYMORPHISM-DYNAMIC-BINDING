public class mainover {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            ContohOverloading ex = new ContohOverloading();
            ex.kurang(44.5f, 5);
            ex.kurang(100, 30.4f);
            ex.kurang(40, 30);
            ex.kurang(100, 45, 10);
            ex.tambah(50, 20, 2, 3);
            ContohOverloading.unggas A = new ContohOverloading.unggas();
            ContohOverloading.unggas B = new ContohOverloading.mamalia();
            A.print();
            B.print();
        }
    }


