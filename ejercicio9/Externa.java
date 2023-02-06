package ejercicio9;

public class Externa {
    private int xExterna = 1;

    public void test(){
        Interna i = new Interna();
    }
    public class Interna{
        private int yInterna = 2;
        public void muestra(){
            System.out.println("Exeterna: "+xExterna);
        }
    }
    public void muestra(){
        //System.out.println("yInterna: "+ yInterna);
    }

    public void muestra1(){
        Interna i = new Interna();
        System.out.println();
    }

    public static void main(String[] args) {
        Externa e = new Externa();
        e.muestra();
        e.muestra1();
        e.test();
    }
}
