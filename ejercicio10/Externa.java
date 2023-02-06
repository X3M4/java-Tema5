package ejercicio10;

public class Externa {
    private int xExterna = 2;
    public void test(){
        for(int i = 0; i < 10; i++){
            class Interna{
                //INICIO DEL CÓDIGO QUE FALTA
                public void muestra(int x){
                    System.out.printf("%d * %d = %d\n", 2, x, x * 2);
                }
                //FIN DEL CÓDIGO QUE FALTA
            }
            Interna interna = new Interna();
            interna.muestra(i);
        }
    }

    public static void main(String[] args) {
        Externa e = new Externa();
        e.test();
    }

}
