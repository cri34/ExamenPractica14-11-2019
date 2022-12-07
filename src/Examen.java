public class Examen {

    int [] numeros = {5 , 6 , 3 , 5 , 3 , 8 , 1 , 5};
    //ex1
    public int mitjaAritmetica(){
        int mitja=0;
        for (int i = 0; i < numeros.length; i++){
            mitja+= numeros[i];
        }
        mitja= mitja/numeros.length;
        return mitja;
    }




}
