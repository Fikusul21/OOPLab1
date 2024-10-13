import java.math.BigInteger;
import java.util.*;

public class Regele {

    public static void main(String[] args){

        String numar = "100";
        int nrTransformat = Integer.parseInt(numar);

        String nrRetransformat = Integer.toString(nrTransformat);
        System.out.println(nrRetransformat);

        String nrDec = "7.21";
        double nrNat = Double.parseDouble(nrDec);
        System.out.println(nrNat);

        String nrDecRetransformat = Double.toString(nrNat);
        System.out.println(nrDecRetransformat);


        byte valMax = Byte.MAX_VALUE;
        System.out.println(valMax);
        System.out.println((byte)valMax + 2);
        System.out.println(++valMax);
        System.out.println((byte)valMax + 2);


        byte valMin = Byte.MIN_VALUE;
        System.out.println(valMin);
        System.out.println((byte) valMin - 1 + "\n\n");

        int nrIntMax = Integer.MAX_VALUE;
        System.out.println(nrIntMax);
        System.out.println((int)nrIntMax + 1);

        float nrFloatMax = Float.MAX_VALUE;
        float nrFloatMax1 = 2.5f;

        System.out.println(nrFloatMax * nrFloatMax1);


        float nrTest1 = 2.123456789f;
        double nrDoubleCast = (double)(nrTest1);
        double nrDoubleCast1 = 2.123456789;

        System.out.println(nrTest1 + "\n");
        System.out.println(nrDoubleCast + "\n");
        System.out.println(nrDoubleCast1 + "\n");

        //6.4
        int zerImp = 123;
        try{

            System.out.println(zerImp / 0);
            System.out.println(0 / 0);
            System.out.println("Salut"); //dupa ce e eroare gen div0 nu se mai executa mai departe


        }catch (ArithmeticException e){
            System.out.println();e.getMessage();
        }

        //tot 6.4 chestii random

        float nrNeg = -2.75f;
        System.out.println(nrNeg / 0);

        float nrPoz = 2.75f;
        System.out.println(nrPoz / 0);


        //boolean nr1 = 1;
        boolean nr = Boolean.parseBoolean("2");
        System.out.println(nr);


        int nrC = (int)(nrPoz);
        System.out.println(nrC);


        //6.6

        BigInteger nr1 = new BigInteger("1");
        BigInteger sum = new BigInteger("0");

        for(int i = 0; i < 64; i++){
            sum = sum.add(nr1);
            nr1 = nr1.multiply(BigInteger.valueOf(2));
        }

        System.out.println(sum);

        nr1 = BigInteger.valueOf(2);
        sum = BigInteger.valueOf(0);

        for(int i = 0; i < 64; i++){

            sum = sum.add(nr1.pow(i));

        }

        System.out.println(sum);

        Scanner in = new Scanner(System.in);
        System.out.print("Introdu numele: ");
        String nume = in.nextLine();

        System.out.println(nume);

        System.out.print("Introdu varsta: ");
        int nr7 = in.nextInt();

        System.out.println(nr7);

        in.close();
    }

}
