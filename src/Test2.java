public class Test2 {

    public static void main(String[] args) {
        for (int m = 1; m <= 3; m++)
        //  untuk variabel m sama dengan 1 lalu m lebih kecil sama dengan 3 dengan m ditambah 1 
        {
            for (int n = 1; n <= 3; n++)
            // untuk variabel n sama dengan 1 lalu n lebih kecil sama dengan 3 dengan n ditambah 1 
        {
    if (m != 3){
    // jika m tidak sama dengan 3
    
    if (n == 1||n==3)
    // jika n sama dengan 1 atau n sama dengan 3
    {
        System.out.print(" ");
        // cetak kosong
    }
    else{
        System.out.print("*");}
        // cetak "star"
    }
    else{
        System.out.print("*");
        // jika pernyataan pertama tidak memenuhi, maka pernyataan kedua yang akan mencetak
    }
        }
            System.out.println(" ");
            // tambahkan cetak lagi untuk menyusun "star" agar terlihat rapih
        }
    }
    
}
