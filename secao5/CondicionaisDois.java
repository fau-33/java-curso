package secao5;

public class CondicionaisDois {
    public static void main(String[] args) {
        
        // 1 - Condicional ternario
        int numero = 12;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println(resultado);

        // 2 - if else aninhado
        int idade = 12;
        boolean possuiCarteiraDeMotorista = true;

        if(idade >= 18){
            if(possuiCarteiraDeMotorista){

                System.out.println("Vocẽ pode dirigir!");

            }else {
                System.out.println("Vocẽ precisa comprar a carteira de motorista!");

            }

        }else {
            System.out.println("Vocẽ não pode dirigir ainda!");
        }

        // 3 - Precendencia
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado1 = a && b || c;
        System.out.println(resultado1);

        boolean resultado2 = a || b && c;
        System.out.println(resultado2);

        boolean resultado3 = !(a || b) && c;
        System.out.println(resultado3);

        boolean resultado4 = (!a || b) && c;
        System.out.println(resultado4);
    }
}
