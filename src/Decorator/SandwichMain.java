package Decorator;

public class SandwichMain{
    public static void main(String[] args) {
        SandwichFrame sandwich = new SandwichFrame();
        sandwich.setVisible(true);

        Component c1 = new Pavo();
        c1 = new Aguacate(c1);
        System.out.print(c1.getDescripcion());
        System.out.print(" " + "Precio:" + " ");
        System.out.print(c1.getPrecio());
    }
}
