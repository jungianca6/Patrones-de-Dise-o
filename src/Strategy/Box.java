package Strategy;

import java.util.Arrays;
import java.util.List;

public class Box implements Estrategia{
    List<String> movimientos = Arrays.asList("Jab","Gancho","Uppercut");
    @Override
    public void lanzarGolpe() {
        System.out.println(movimientos);

    }
}
