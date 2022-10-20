package TugasOOP;
class rumusLuas{
    static int p, l, t, a;
    public static int hPersegi() {
        int luasPersegi = p * l;
        return luasPersegi;
    }
    public static int hSegitiga() {
        int luasSegitiga = a * t / 2;
        return luasSegitiga;
    }
}

class rumusKeliling extends rumusLuas {
    public static int hKelPersegi(){
        int kelPersegi = (p*2)+(l*2);
        return kelPersegi;
    }

    public static double hHypoTri(){            //mencari sisi segitiga yang belum diketahui
        double hypoTri = Math.sqrt((a*a)+(t*t));
        return hypoTri;
    }

    public static double hKelSegitiga(){
        double kelSegitiga = a + t + hHypoTri();
        return kelSegitiga;
    }
}

class Problem1MenghitungLuasDanKeliling extends rumusLuas {
    public static void main(String[] args) {
        System.out.println("Luas");
        rumusLuas luasPersegi = new rumusLuas();
        luasPersegi.p = 4;
        luasPersegi.l = 4;
        System.out.println("Persegi : "+luasPersegi.hPersegi());

        rumusLuas luasSegitiga = new rumusLuas();
        luasSegitiga.a = 3;
        luasSegitiga.t = 4;
        System.out.println("Segitiga : "+luasSegitiga.hSegitiga());

        rumusLuas luasPersegiPanjang = new rumusLuas();
        luasPersegiPanjang.p = 7;
        luasPersegiPanjang.l = 8;
        System.out.println("luas Persegi Panjang adalah : "+luasPersegiPanjang.hPersegi());

        System.out.println();
        System.out.println("Keliling");
        rumusKeliling kelPersegi = new rumusKeliling();
        kelPersegi.p = 4;
        kelPersegi.l = 4;
        System.out.println("Persegi : "+kelPersegi.hKelPersegi());

        rumusKeliling kelSegitiga = new rumusKeliling();
        kelSegitiga.a = 3;
        kelSegitiga.t = 4;
        System.out.printf("Segitiga : %.0f \n",kelSegitiga.hKelSegitiga());

        rumusKeliling kelPersegiPanjang = new rumusKeliling();
        kelPersegiPanjang.p = 7;
        kelPersegiPanjang.l = 8;
        System.out.println("Persegi Panjang : "+kelPersegiPanjang.hKelPersegi());
    }
}