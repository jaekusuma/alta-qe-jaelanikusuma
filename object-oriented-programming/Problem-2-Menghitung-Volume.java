package TugasOOP;
class rumusVolume{
    static double p,l,t,r;
    public static double hKubus(){
        double vKubus = Math.pow(p,3);
        return vKubus;
    }
    public static double hBalok(){
        double vBalok = p * l * t;
        return vBalok;
    }
    public static double htabung(){
        double vTabung = Math.pow(r,2) * t * 22 / 7;
        return vTabung;
    }
}

public class Problem2MenghitungVolume extends rumusVolume {
    public static void main(String[] args) {
        System.out.println("Volume");
        rumusVolume vKubus = new rumusVolume();
        vKubus.p=10;
        System.out.printf("Kubus : %.0f\n",rumusVolume.hKubus());

        rumusVolume vBalok = new rumusVolume();
        vBalok.p=3;
        vBalok.l=6;
        vBalok.t=10;
        System.out.printf("Balok : %.0f\n",rumusVolume.hBalok());

        rumusVolume vTabung = new rumusVolume();
        vTabung.r=7;
        vTabung.t=10;
        System.out.printf("Tabung : %.0f\n",rumusVolume.htabung());
    }
}