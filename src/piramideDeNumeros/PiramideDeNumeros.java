package piramideDeNumeros;

public class PiramideDeNumeros {
    public void piramideDeNumeros(int smaller, int bigger) {
        if (smaller > bigger) {
            System.out.println("Primeiro número deve ser menor!");
        } else if (smaller < 1) {
            System.out.println("O número menor não pode ser menor '1'");
        } else {
            for (int i = smaller; i <= bigger; i++) {
                String line = "";
                for (int j = 1; j <= i; j++) {
                    line += i;
                }
                System.out.println(line);
            }
        }
    }
}
