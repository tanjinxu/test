package demo;

import java.math.BigInteger;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("aaa");
        str.append("bbb");
        str.toString();
        System.out.println(str);

        int aa = 3;
        BigInteger inT = BigInteger.valueOf(aa);
        BigInteger bb = inT.add(inT);
        BigInteger cc = bb.multiply(bb);
        System.out.println(cc);

        Scanner sc = new Scanner(System.in);
        System.out.println("hoe many number do you need to draw?");
        int k = sc.nextInt();

        System.out.println("what is the hightest number you can draw ?");
        int n = sc.nextInt();
        BigInteger lotterOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotterOdds = lotterOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(1));
        }
        System.out.println(lotterOdds);// @@@@@@@@@@@@@@@@@@@@@$%%$$%$%
    }
}
