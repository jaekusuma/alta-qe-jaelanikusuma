package TugasOOP;
public class Problem3Kalkulator {
    private static int penjumlahan(int a,int b){
        int hasil = a + b;
        System.out.println("Penjumlahan : "+hasil);
        return hasil;
    }

    private static int pengurangan(int a,int b){
        int hasil = a - b;
        System.out.println("Pengurangan : "+hasil);
        return hasil;
    }

    private static int perkalian(int a,int b){
        int hasil = a * b;
        System.out.println("Perkalian : "+hasil);
        return hasil;
    }

    private static int pembagian(int a,int b){
        int hasil = a / b;
        System.out.println("Pembagian : "+hasil);
        return hasil;
    }

    public static void main(String[] args) {
        penjumlahan(3,4);
        pengurangan(15,4);
        perkalian(10,10);
        pembagian(12,3);
    }
}