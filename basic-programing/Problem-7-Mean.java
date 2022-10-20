public class Problem7Mean {
    private static float Mean(float[] numbers){
        float jumlah = 0;

        for (int i = 0; i < numbers.length; i++){
            jumlah = jumlah + numbers[i];
        }
        jumlah = jumlah / numbers.length;
        return jumlah;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}