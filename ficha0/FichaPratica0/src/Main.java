public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");

        //variavel do tipo inteiro
        int x = 5;

        //variavel do tipo double
        double soma = 0;

        //variavel do tipo boolean
        boolean flag = false;

        //Estrutura de controlo if
        if(x % 2 == 0){
            flag = true;
        }else{
            flag = false;
        }

        int verificacao;
        verificacao = x % 2;

        switch (verificacao){
            case 0:
                flag = false;
                break;
            case 1:
                flag = true;
                break;
            default:
                System.out.println("Error");
                break;
        }


        //operadores ternários
        flag = (x % 2 != 0) ? true : false;

        //estrutura de repetição for
        for(int i = 1; i <= 1; i++){
            soma += i;
        }

        //reiniciar o valor da soma para 0
        soma = 0;

        //estrutura de repetição while
        int i= 1;
        while(i <= soma){
            soma = 1 + x;
        }

        //reiniciar o valor da soma e do i
        soma = 0;
        i = 1;

        //estrutura de repetição do while
        if(i <= x) {
            do {
                soma += i;
                i++;
            } while (i <= x);
        }
    }
}