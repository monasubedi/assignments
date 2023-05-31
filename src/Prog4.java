public class Prog4 {
    public static void main(String[]args){

        float f1 = 1.27f;
        float f2 = 3.881f;
        float f3 = 9.6f;

        float sum = f1 + f2 + f3;

        int answer1 = (int) sum;
        int answer2 = (int)Math.round(sum);

        System.out.println(answer1);

        System.out.println(answer2);



    }
}
