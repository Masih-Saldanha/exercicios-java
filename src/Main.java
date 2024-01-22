import o_que_e_esse_numero.AnalisarNumero;

public class Main {
    public static void main(String[] args) {
        AnalisarNumero analisarNumero = new AnalisarNumero();
        System.out.println(analisarNumero.Analisa(-2));
        System.out.println(analisarNumero.Analisa(-1));
        System.out.println(analisarNumero.Analisa(0));
        System.out.println(analisarNumero.Analisa(1));
        System.out.println(analisarNumero.Analisa(2));
    }
}