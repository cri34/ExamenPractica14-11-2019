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
    public int returnIndMinValue(int[] numeros, int index) {
        int indMin = index;
        for (int i = index; i < numeros.length; i++) {
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
    public int returnIndMaxValue(int[] numeros, int indFinal) {
        int indMax = 0;
        for (int i = 0; i <= indFinal; i++) {
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
        int dif, difMin;
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

    //11
    public int[] returnIntercambiValMajorArray(int[] numeros, int ind) {
        int[] intercambi = new int[numeros.length];
        int indMax = returnIndMaxValue(numeros, ind);
        int temp;
        for (int i = 0; i < numeros.length; i++) {
            intercambi[i] = numeros[i];
        }
        temp = intercambi[ind];
        intercambi[ind] = intercambi[indMax];
        intercambi[indMax] = temp;
        return intercambi;
    }

    //12
    public int[] ordenarArray(int[] numeros) {
        int[] numOrd = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++)
            numOrd[i] = numeros[i];
        while (!checkOrdenAsc(numOrd)) {
            for (int i = numOrd.length - 1; i >= 0; i--) {
                numOrd = returnIntercambiValMajorArray(numOrd, i);
            }
        }
        return numOrd;
    }

    //012345678
    //7 modelExamen2
    public boolean checkValorsIndexParOrdenats(int[] numeros) {
        for (int i = 0; i < numeros.length - 2; i++) {
            if (i % 2 != 0)
                continue;
            if (numeros[i] > numeros[i + 2])
                return false;
        }
        return true;
    }

    //9 modelExamen2
    public int returnIndLastOcurr(int[] numeros, int ocurr) {
        int indLastOcur = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == ocurr)
                indLastOcur = i;
        }
        return indLastOcur;
    }

    //10 modelExamen2
    public int returnNumeroLejanoMedia(int[] numeros) {
        int media = mitjaAritmetica(numeros);
        int indVLM = 0;
        int difPosAct, difMax;
        for (int i = 0; i < numeros.length; i++) {
            difPosAct = numeros[i] - media;
            difMax = numeros[indVLM] - media;
            if (difPosAct < 0)
                difPosAct = -difPosAct;
            if (difMax < 0)
                difMax = -difMax;
            if (difPosAct > difMax) {
                indVLM = i;
            }
        }
        return numeros[indVLM];
    }

    //11 model2
    public int[] intercambiarMinVal(int[] numeros, int index) {
        int[] inter = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++)
            inter[i] = numeros[i];

        int indMin = returnIndMinValue(numeros, index);
        int temp = inter[index];
        inter[index] = inter[indMin];
        inter[indMin] = temp;
        return inter;
    }

    //12 model2
    public int[] ordenarArrayModel2(int[] numeros) {
        int[] ord = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++)
            ord[i] = numeros[i];
        for (int i = 0; i < numeros.length; i++) {
            ord = intercambiarMinVal(ord, i);
        }
        return ord;
    }
}
