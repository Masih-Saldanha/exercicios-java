package o_que_e_esse_numero;

public class AnalisarNumero {
    public String Analisa(int numero) {
        String parOuImpar = "par";
        String positivoOuNegativo = "positivo";
        if (numero % 2 == 1 || numero % 2 == -1) {
            parOuImpar = "ímpar";
        }
        if (numero < 0) {
            positivoOuNegativo = "negativo";
        }
        return numero + " é " + parOuImpar + " e " + positivoOuNegativo;
    };
}
