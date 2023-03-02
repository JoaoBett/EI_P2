public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");

        //variavel do tipo inteiro
        int x = 5;

        //variavel do tipo double
        double sum = 0;

        //variavel do tipo boolean
        boolean flag = false;

        //Estrutura de controlo if
        if(x % 2 == 0){
            flag = true;
        }else{
            flag = false;
        }

        int verification;
        verification = x % 2;

        switch (verification){
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
            sum += i;
        }

        //reiniciar o valor da soma para 0
        sum = 0;

        //estrutura de repetição while
        int i= 1;
        while(i <= sum){
            sum = 1 + x;
        }

        //reiniciar o valor da soma e do i
        sum = 0;
        i = 1;

        //estrutura de repetição do while
        if(i <= x) {
            do {
                sum += i;
                i++;
            } while (i <= x);
        }
    }
}