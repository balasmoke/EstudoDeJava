public class Main{

    /**
     * Casting = Alterar tipo do Dado
      */
    public static void main(String[] args) {

        int x = 10;// não ocorre casting pos o 10 e compativel com o tipo int

        long xL = 10;//ocorre casting pos o valor 10[inteiro] e convertido internamente para long
        // para possibilitar tal operação desta maneira isto e um CASTING IMPLICITO

        double d = 35;// ocorre casting pos o 35 esta sendo convertido para double inda um CASTING IMPLICITO

        float f = 40;//ocorrendo casting de 40 para float

        float fD = (float) 40.0;// CASTING EXPLICITO de double[40.0] para (float) tipo resultado do casting vai entre parenteses

        short s = (short) 100000;// CASTING EXPLICITO para shot onde o valor 100.000 e inserido em um shot.
        //Tal operação gera um erro ja que o short e muito menor que isso resultando no estouro da mesma

        // FIXME: 11/09/2018 tormar cuidado com casting pos o valor pode não caber na variavel e pode ocorrer o mesmo que o short

    }
}