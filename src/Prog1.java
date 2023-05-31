

public class Prog1 {
    public static void main(String[]args){
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3,14);
        double PI = Math.PI;

        System.out.println(Math.pow(PI,x));
        System.out.println(Math.pow(y,PI));

    }
}
