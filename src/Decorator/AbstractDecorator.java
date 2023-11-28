package Decorator;

public class AbstractDecorator implements Component {
    protected Component sandwich;
    double precio;
    String descripcion;

    public AbstractDecorator(Component sandwich, double precio, String descripcion){
        this.sandwich = sandwich;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public double getPrecio() {
        return sandwich.getPrecio() + this.precio;
    }

    @Override
    public String getDescripcion() {
        return sandwich.getDescripcion() + "+" +this.descripcion;
    }
}

class Aguacate extends AbstractDecorator{
    public Aguacate(Component sandwich) {
        super(sandwich, 1.5, "Aguacate");
    }
}

class DobleProteina extends AbstractDecorator{
    public DobleProteina(Component sandwich) {
        super(sandwich, 4.5, "Doble Proteina");
    }
}

class Hongos extends AbstractDecorator{
    public Hongos(Component sandwich) {
        super(sandwich, 0.85, "Hongos");
    }
}
class Refresco extends AbstractDecorator{
    public Refresco(Component sandwich) {
        super(sandwich, 1, "Refresco");
    }
}
class Sopa extends AbstractDecorator{
    public Sopa(Component sandwich) {
        super(sandwich, 4.2, "Sopa");
    }
}
class Postre extends AbstractDecorator{
    public Postre(Component sandwich) {
        super(sandwich, 3.5, "Postre");
    }
}

class AguacateGrande extends AbstractDecorator{
    public AguacateGrande(Component sandwich) {
        super(sandwich, 2.5, "Aguacate");
    }
}

class DobleProteinaGrande extends AbstractDecorator{
    public DobleProteinaGrande(Component sandwich) {
        super(sandwich, 8, "Doble Proteina");
    }
}

class HongosGrande extends AbstractDecorator{
    public HongosGrande(Component sandwich) {
        super(sandwich, 1.45, "Hongos");
    }
}
