package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {
        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");

        int sum = 0;

        for (int i = 1; i <= 2048; i*=2) {
            sum += i;
            System.out.printf("%d\t%.0f\t%d\n", i, Math.log(i) / Math.log(2), sum);
        }
    }
}