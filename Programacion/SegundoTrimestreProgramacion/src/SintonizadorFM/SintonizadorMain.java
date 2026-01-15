package SintonizadorFM;
public class SintonizadorMain {
    public static void main(String[] args) {
        SintonizadorFM a, b, c;
        a = new SintonizadorFM(107);
        a.up(); a.up(); a.up(); a.up();
        a.display();
        
        b= new SintonizadorFM(80.5);
        b.down(); b.down(); b.down();
        b.display();
        
        c = new SintonizadorFM(200);
        c.display();
    }
}