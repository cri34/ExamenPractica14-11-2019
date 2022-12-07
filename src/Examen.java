public class Examen {
    //ex1
    public int mitjaAritmetica(int[] numeros) {
        int mitja = 0;
        for (int i = 0; i < numeros.length; i++) {
            mitja += numeros[i];
        }
        mitja = mitja / numeros.length;
        return mitja;
    }

    //ex2
    public int minValue(int[] numeros) {
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    //ex3
    public int returnIndMinValue(int[] numeros) {
        int indMin = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < numeros[indMin]) {
                indMin = i;
            }
        }
        return indMin;
    }

    //4
    public int maxValue(int[] numeros) {
        int max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    //5
    public int returnIndMaxValue(int[] numeros) {
        int indMax = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeros[indMax]) {
                indMax = i;
            }
        }
        return indMax;
    }

    //6
    public boolean checkOrdenAsc(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }
    //7

    public boolean checkOrdenDes(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //8
    public int[] returnInversArray(int[] numeros) {
        int[] invers = new int[numeros.length];
        int l = numeros.length - 1;
        for (int i = 0; i < numeros.length; i++) {
            invers[i] = numeros[l - i];
        }
        return invers;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

    }

    //9
    public int reuturIndOcurr(int[] numeros, int numOccurr) {

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numOccurr) {
                return i;
            }
        }
        return -1;
    }

    //10
    public int returnProxNumbToAverage(int[] numeros) {
        int avN = mitjaAritmetica(numeros);
        int indDifMin = 0;
        int dif,difMin;
        for (int i = 0; i < numeros.length; i++) {
            dif = avN - numeros[i];
            difMin = avN - numeros[indDifMin];
            if (dif < 0)
                dif = -dif;
            if (difMin < 0)
                difMin = -difMin;
            if (dif < difMin)
                indDifMin = i;
            if (avN - numeros[indDifMin] == 0)
                break;
        }
        return numeros[indDifMin];
    }
}
