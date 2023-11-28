package Strategy;


import java.util.Arrays;
import java.util.List;

public class Capoeira implements Estrategia{

    List<String> movimientos = Arrays.asList("Armada","Pontillo","Materia");
    @Override
    public void lanzarGolpe() {
        System.out.println(movimientos);

    }
}
