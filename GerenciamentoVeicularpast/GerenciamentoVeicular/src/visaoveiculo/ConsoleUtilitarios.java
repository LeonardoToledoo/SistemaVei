package visaoveiculo;

public class ConsoleUtilitarios {
    public static void LimparConsole(){
        System.out.print("\033[H\033[2J");   
        System.out.flush();             
    }
}