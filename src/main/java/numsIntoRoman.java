
public class numsIntoRoman {
    public static void main(String[] args) {
        String x = intoRoman(1994);
        System.out.println(x);
    }

    public static String intoRoman(int num) {
        int[] key = {1000, 900,500,400, 100,90, 50,40,10,9, 5, 4,1};
        String[] values = {"M", "CM","D", "CD","C","XC", "L","XL", "X","IX", "V","IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();

        while (num > 0) {
            for (int i = 0; i < key.length - 1; i++) {
                    if (num >= key[i + 1] && num < key[i]) {
                        stringBuilder.append(values[i + 1]);
                        num = num - key[i + 1];
                        intoRoman(num);
                    }else if(num>key[0]){
                            stringBuilder.append(values[0]);
                            num=num-key[0];
                            intoRoman(num);
                    }
                }
            }


         return stringBuilder.toString();
    }
}