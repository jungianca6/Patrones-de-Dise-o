package Strategy;

public class Peleador {
    Estrategia estrategia;

    public Peleador(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void pelear(){
        estrategia.lanzarGolpe();
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

}

