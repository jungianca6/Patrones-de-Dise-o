package Decorator;

public abstract class Sandwich implements Component {
    int precio;
    String descripcion;

    public Sandwich(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }
}

class Pavo extends Sandwich{
    public Pavo(){
        super(12, "Pavo de 15cm");
    }
}

class Italiano extends Sandwich{
    public Italiano(){
        super(9, "Italiano de 15cm");
    }
}

class Beef extends Sandwich{
    public Beef(){
        super(10, "Beef de 15cm");
    }
}

class Veggie extends Sandwich{
    public Veggie(){
        super(8, "Veggie de 15cm");
    }
}

class Atun extends Sandwich{
    public Atun(){
        super(11, "Atun de 15cm");
    }
}

class Pollo extends Sandwich{
    public Pollo(){
        super(12, "Pollo de 15cm");
    }
}

class PavoGrande extends Sandwich{
    public PavoGrande(){
        super(18, "Pavo de 30cm");
    }
}

class ItalianoGrande extends Sandwich{
    public ItalianoGrande(){
        super(16, "Italiano de 30cm");
    }
}

class BeefGrande extends Sandwich{
    public BeefGrande(){
        super(16, "Beef de 30cm");
    }
}

class VeggieGrande extends Sandwich{
    public VeggieGrande(){
        super(14, "Veggie de 30cm");
    }
}

class AtunGrande extends Sandwich{
    public AtunGrande(){
        super(17, "Atun de 30cm");
    }
}

class PolloGrande extends Sandwich{
    public PolloGrande(){
        super(18, "Pollo de 30cm");
    }
}

