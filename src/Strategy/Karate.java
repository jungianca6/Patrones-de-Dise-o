package Strategy;

import java.util.Arrays;
import java.util.List;

public class Karate implements Estrategia{
    List<String> movimientos =
            Arrays.asList("Mae geri","Yoko geri","Mawashi geri");
    @Override
    public void lanzarGolpe() {
        System.out.println(movimientos);
    }
}
