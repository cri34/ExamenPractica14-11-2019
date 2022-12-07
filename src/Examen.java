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
    //ex2
     public int minValue(){
        int min= numeros[0];
        for (int i =0; i < numeros.length; i++){
            if (numeros[i]< min){
                min = numeros[i];
            }
        }
        return  min;
     }




}
