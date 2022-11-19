public class Main {
    public static void main(String[] args) {


        System.out.println("Resultado= " + suma(1, 2, 3));

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println("Puertas= " + miCoche.puertas);
    }


    public static int suma(int a, int b, int c) {
        int resultant = a + b + c;
        return resultant;
    }
    static class Coche {
        public int puertas = 0;

        public void SumarPuertas() {
            this.puertas++;
        }

    }
}