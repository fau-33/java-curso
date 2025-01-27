package secao8;

public class FuncoesB {
    public static void main(String[] args) {

        // 5 - Funções com condicionais
        String r1 = verificarAcesso(18, true, true);
        System.out.println(r1);

        String r2 = verificarAcesso(25, false, false);
        System.out.println(r2);  


        
    }

    public static String verificarAcesso(int idade,boolean temCarteira, boolean temHistoricoNegativo) {

        if(idade >= 18 && temCarteira && !temHistoricoNegativo){
            return "Acesso permitido";
        }else if(idade >= 18 && temCarteira && temHistoricoNegativo){
            return "Acesso permitido com restrições";
        }else {
            return "Acesso negado";
        }
        
    }
}
