public class ExamenTest {
    public static void main(String[] args) {
        Examen e = new Examen();
        int [] numeros = {5 , 6 , 3 , 5 , 3 , 8 , 1 , 5};
        System.out.println(e.mitjaAritmetica(numeros));
        System.out.println(e.minValue(numeros));
        System.out.println(e.returnIndMinValue(numeros,0));
        System.out.println(e.maxValue(numeros));
        System.out.println(e.returnIndMaxValue(numeros, numeros.length-1));
        System.out.println(e.checkOrdenAsc(numeros));
        System.out.println(e.checkOrdenDes(numeros));
        e.printArray(e.returnInversArray(numeros));
        System.out.println(e.reuturIndOcurr(numeros,5));
        System.out.println(e.returnProxNumbToAverage(numeros));
        e.printArray(e.returnIntercambiValMajorArray(numeros,7));
        e.printArray(e.ordenarArray(numeros));
        //ex7 model2
        e.printArray(numeros);
       System.out.println( e.checkValorsIndexParOrdenats(numeros));
       //ex9 model2
       System.out.println(e.returnIndLastOcurr(numeros,5));
        //ex10 model2
       System.out.println(e.returnNumeroLejanoMedia(numeros));
       //ex11 model2
        e.printArray(e.intercambiarMinVal(numeros,0));
        //ex12 model2
        e.printArray(e.ordenarArrayModel2(numeros));
    }
}