package TugasOOP;
class hDimensi{
    static double p,l,t;
    public static double hDimensi(){
        double hD = p * l * t;
        return hD;
    }
}

public class Problem4OngkosKirim extends hDimensi {
    public static double hargaD(){
        double hargaD = 0;
        for (double i = 0; i <= hDimensi.hDimensi();i++){
            if (i < 50){
                hargaD = 0;
            }else
            if (i % 50 == 0){
                hargaD += 5000;
            }
        }
        return hargaD;
    }

    public static double hBerat(double bb){
        double hB = 0;
        for (double i = 0; i < bb;i++){
            hB += 5000;
        }
        double hTotal = hargaD() + hB;
        System.out.printf("Harga : Rp %.0f",hTotal);
        return hB;
    }

    public static void main(String[] args) {
        hDimensi vDimensi = new hDimensi();
        vDimensi.p = 5;
        vDimensi.l = 2;
        vDimensi.t = 4;
        hBerat(1);
    }
}