public class Problem2KonversiNilai {
    public static void main(String[] args) {

        int studentScrore = 80;

        if (studentScrore > 100){
            System.out.print("invalid");
        }else if (studentScrore >= 80){
            System.out.println("Nilai A");
        }else if (studentScrore >= 65){
            System.out.println("Nilai B+");
        }else if (studentScrore >= 50){
            System.out.println("Nilai B");
        }else if (studentScrore >= 35){
            System.out.println("Nilai C");
        }else if (studentScrore >= 0){
            System.out.println("Nilai D");
        }else{
            System.out.println("invalid");
        }
    }
}
