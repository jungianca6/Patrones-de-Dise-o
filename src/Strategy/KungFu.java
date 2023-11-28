package Strategy;

import java.util.Arrays;
import java.util.List;

public class KungFu implements Estrategia{
    List<String> movimientos =
            Arrays.asList("Ch 'ien","Kuan Tsu","Pei tsu");
    @Override
    public void lanzarGolpe() {
        System.out.println(movimientos);
    }
}
