package duplicadosNao;

import java.util.ArrayList;
import java.util.List;

public class DuplicadosNao {
    public void duplicadosNao(String[] array_1, String[] array_2) {
        List<String> array_3 = new ArrayList<>();

        for (int i = 0; i < array_1.length; i++) {
            String element_1 = array_1[i];
            for (int j = 0; j < array_2.length; j++) {
                String element_2 = array_2[j];
                if (element_1 == element_2) {
                    array_3.add(element_2);
                }
            }
        }

        System.out.println(array_3);
    }
}
