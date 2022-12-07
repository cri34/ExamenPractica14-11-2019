public class ExamenTest {
    public static void main(String[] args) {
        Examen e = new Examen();
        int [] numeros = {5 , 6 , 3 , 5 , 3 , 8 , 1 , 5};
        System.out.println(e.mitjaAritmetica(numeros));
        System.out.println(e.minValue(numeros));
        System.out.println(e.returnIndMinValue(numeros));
        System.out.println(e.maxValue(numeros));
        System.out.println(e.returnIndMaxValue(numeros));
    }
}