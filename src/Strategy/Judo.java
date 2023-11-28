package Strategy;


import java.util.Arrays;
import java.util.List;

public class Judo implements Estrategia{
    List<String> movimientos =
            Arrays.asList("Tai Otoshi","Koshi","Osoto Gari");
    @Override
    public void lanzarGolpe() {
        System.out.println(movimientos);
    }
}
