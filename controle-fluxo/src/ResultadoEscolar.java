public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota =7;
        String Resultado = nota >=7 ? "aprovado" : nota>=5 && nota <7 ? "Recuperação":"Reprovado" ;
        System.out.println(Resultado);
    }
}
