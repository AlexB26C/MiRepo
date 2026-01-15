package Bombilla;

public class BombillaMain {

    public static void main(String[] args) {
        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b1.encender();
        b2.apagar();
        System.out.println("b1: " + b1.mostrarEstadoBombilla());
        System.out.println("b2: " + b2.mostrarEstadoBombilla());
        Bombilla.interruptorGeneral = false;
        System.out.println("\nCortamos la luz general");
        System.out.println("b1: " + b1.mostrarEstadoBombilla());
        System.out.println("b2: " + b2.mostrarEstadoBombilla());
        Bombilla.interruptorGeneral = true; // activamos la luz
        System.out.println("\nActivamos la luz general");
        System.out.println("b1:" + b1.mostrarEstadoBombilla());
        System.out.println("b2: " + b2.mostrarEstadoBombilla());
    }

}
