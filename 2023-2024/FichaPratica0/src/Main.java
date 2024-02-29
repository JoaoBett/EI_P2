public class Main {
    public static void main(String[] args) {
        int x = 5;
        double soma = 0;
        boolean flag = false;

        // IF
        if(x % 2 == 0){
            flag = true;
        }

        // SWITCH
        switch (x % 2){
            case 1:
                flag = false;
                break;
            default:
                flag = true;
        }

        // TERNARY OPERATOR
        flag = (x % 2 == 0) ? true : false;

        // OTHER CASE
        flag = (x%2==0);

        // ADD FOR(loop)
        int i;
        for(i = 0; i<=x; i++){
            soma+=i;
        }

        // ADD While(loop)
        soma = 0;
        i = 0;
        while(i <= x){
            soma+=i;
            i++;
        }

        // ADD Do...While(loop)
        soma = 0;
        i = 0;
        do{
            soma+=i;
            i++;
        }while(i <= x);

        // CONTINUE USE
        for(i = 0; i<=x; i++){
            if (i == 3){
                continue;
            }
            soma+=i;
        }
    }
}