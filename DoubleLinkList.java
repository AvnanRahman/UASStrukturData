package UAS;

import java.util.Scanner;

public class DoubleLinkList {
    public static void main(String[] args) {
        DoubleLink list = new DoubleLink();

        int menu;

        System.out.println("");
        while (true) {
            System.out.println("");
            System.out.println("Pilih Menu dibawah ini:");
            System.out.println("1.Memasukkan Data");
            System.out.println("2.Menghapus Data");
            System.out.println("3.Mengupdate Data");
            System.out.println("4.Menampilkan Data");
            System.out.println("5.Keluar");
            System.out.print("Anda memilih: ");

            while (true) {
                try {
                    Scanner scan = new Scanner(System.in);
                    menu = scan.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("input tidak valid, silakan masukan input kembali : ");
                }
            }

            System.out.println("");

            switch (menu) {
                case 1:
                    Scanner in = new Scanner(System.in);
                    // char laki ='l';
                    // char cewe ='p';

                    System.out.println("masukkan nama");
                    String name = in.next();
                    System.out.println("masukkan nim");
                    int nim = in.nextInt();
                    System.out.println("masukkan jenis kelamin");
                    char gender = in.next().charAt(0);
                    list.insertSort(name, nim, gender);

                    // if(jk == laki) {
                    // list.insertFirst(nama,nim,jk);
                    // break;
                    // }
                    // else if (jk == cewe) {
                    // list.insertLast(nama,nim,jk);
                    // break;
                    // } else {
                    // break;
                    // }
                    break;
                case 2:
                    list.deleteLast();
                    break;
                case 3:

                    break;
                case 4:
                    list.tampilMaju();
                    break;
                case 5:

            }

        }

        // System.out.println("Data pertama, {202,Afnan Ngathour, L} dimasukkan dengan
        // insertFirst");
        // list.insertFirst(202, "Afnan Ngathour", "L");
        // list.tampilMaju();
        // list.insertFirst(222, "Rama", "L");
        // list.insertLast(212, "Rahman", "W");
        // System.out.println("");
        // list.tampilMaju();
        // list.tampilMundur();
        // list.insertFirst(44, 44.99);
        // System.out.println("Memasukkan data ke-2, {44, 44.99}, di depan");
        // list.tampilMaju();
        // list.insertLast(11, 11.99);
        // list.insertLast(33, 33.99);
        // System.out.println("");
        // System.out.println("Memasukkan data ke-3 --> {11, 11.99} dan ke-4 --> {33,
        // 33.99}, di belakang");
        // list.tampilMaju();
        // System.out.println("");
        // System.out.println("Menampilkan data dari depan ke belakang");
        // list.tampilMaju();
        // System.out.println("");
        // System.out.println("Menampilkan data dari belakang ke depan");
        // list.tampilMundur();
        // list.deleteFirst();
        // System.out.println("");
        // System.out.println("Menghapus data paling depan, {44, 44.99}");
        // list.tampilMaju();
        // list.deleteLast();
        // System.out.println("");
        // System.out.println("Menghapus data paling belakang, {33, 33.99}");
        // list.tampilMaju();
        // list.hapus(11);
        // System.out.println("");
        // System.out.println("Menghapus data {11,11.99}");
        // list.tampilMaju();
        // list.insertAfter(22, 77, 77.99);
        // System.out.println("");
        // System.out.println("Memasukkan data {77,77.99} setelah data {22,22.99}");
        // list.tampilMaju();
        // list.insertAfter(22, 88, 88.99);
        // System.out.println("");
        // System.out.println("Memasukkan data {88,88.99} setelah data {22,22.99}");
        // list.tampilMaju();
    } // end main()
}
// end class DoubleLinkList
