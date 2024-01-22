package multiplicaAi;

public class MultiplicaAi {
    public void multiplicaAi(int numero) {
        System.out.println("Tabela de multiplicação de " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }
    }
}
