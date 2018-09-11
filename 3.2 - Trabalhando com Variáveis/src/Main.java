public class Main {
    /**
     * Tipos primitivos de Variaveis
     * */
    public static void main(String[] args) {

        /** Tipos primitivos de viariaveis lista:
        * Inteiros: byte, short, int, long.
        * Ponto Flutuante(numeros com virgula): float, double.
        * Caractere: char.
        * Booleano: boolean.
        * */

        //Declaração de variavel do tipo inteiro sem atribuição de valor
        int numero;

        //atribuição de valor a variavel inteira
        numero = 50;

        //Declaração de variavel do tipo inteiro com atribuição de valor
        int numeroAtribuido = 50;

        //Declaração de variavel do tipo inteiro com atribuição de valor baseada no calculo de variaveis
        int numeroSomado=numeroAtribuido+numero;//neste caso o calculo e executado antes de atribuir o valor a vareivel
                                                //no caso primeiro e feito a soma e depois é adicionado a variavel

        //Somatorio de numeros com variavel inteira
        numero+=2;//tal operação funciona com todos os operadores (+,-,*,/) [esta operação e a mesma coisa de numero= numero+ 2]

        //Variaveis não são inicializadas automaticamente, e nescessario inicializalas sempre

        //variaveis mas abrangente predominam sobre variaveis menos predominantes
        //(caso abaixo) oque gera um erro de tipo pois uma variavel não cabe na outra
        /**/long /* int */ i = 10L + 5;// o inteiro i tenta receber o resultado da conta = 10 long + 5 inteiro
        // desta forma o correta seria um long receber tal rezultado

        //o mesmo vale para outros tipos como um inteiro tentar receber um double ou float



    }
}