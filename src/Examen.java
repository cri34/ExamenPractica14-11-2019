public class Examen {
    //ex1
    public int mitjaAritmetica(int [] numeros){
        int mitja=0;
        for (int i = 0; i < numeros.length; i++){
            mitja+= numeros[i];
        }
        mitja= mitja/numeros.length;
        return mitja;
    }
    //ex2
     public int minValue(int [] numeros){
        int min= numeros[0];
        for (int i =0; i < numeros.length; i++){
            if (numeros[i]< min){
                min = numeros[i];
            }
        }
        return  min;
     }

     //ex3
    public int returnIndMinValue(int [] numeros){
        int indMin=0;
        for (int i =0; i < numeros.length; i++){
            if (numeros[i]< numeros[indMin]){
               indMin = i;
            }
        }
        return indMin;
    }
    //4
    public int maxValue(int [] numeros){
        int max = numeros[0];

        for (int i=0; i < numeros.length;i++){
            if (numeros[i]> max){
                max = numeros[i];
            }
        }
        return max;
    }
    //5
    public int returnIndMaxValue(int [] numeros){
        int indMax=0;
        for (int i = 0; i < numeros.length;i++ ){
            if (numeros[i] > numeros[indMax]){
                indMax = i;
            }
        }
    return indMax;
    }
    //6
    public  boolean checkOrdenAsc( int [] numeros){
        for (int i = 0; i < numeros.length -1 ; i++){
            if (numeros[i] > numeros[i+1]){
                return false;
            }
        }
    return true;
    }


}
