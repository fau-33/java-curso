package secao5;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // 8 - AND

        int idade = 18;
        boolean possuiCarteiraDeMotorista = true;

        System.out.println(idade > 18 && possuiCarteiraDeMotorista);
        System.out.println(idade > 18 && possuiCarteiraDeMotorista == true);

        boolean carteiraVencida = false;

        System.out.println(idade > 18 && possuiCarteiraDeMotorista && carteiraVencida == false);

        // 9 - OR
        boolean estaChovendo = true;
        boolean tenGuardaChuva = false;

        System.out.println(estaChovendo || tenGuardaChuva);

        // 10 - NOT
        boolean estaChovendo2 = true;
        System.out.println(!estaChovendo2);

        
    }
}
