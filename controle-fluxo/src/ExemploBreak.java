public class ExemploBreak {
    public static void main(String[] args) {
        for( int numero =1; numero <=5; numero++){
            if(numero ==3){
                continue;
                //muda o fluxo
            }
            
            if(numero ==5){
                break;
                //interrompe
            }
            System.out.println("Numero atual: "+ numero);
        }
    }
}
