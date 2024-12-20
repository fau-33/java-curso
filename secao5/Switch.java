package secao5;

public class Switch {
    public static void main(String[] args) {
        // 11 - SWITCH case e break
        // Para validar dias da semana
        int diaDaSemana = 1;

        switch(diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;      

        }

        // 12 - Default
        int n1 = 10;
        switch (n1) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;    
            default:
                System.out.println("Numero não encontrado");
                break;
        }  
    }
}
