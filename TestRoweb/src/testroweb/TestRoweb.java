package testroweb;

public class TestRoweb {

    public static void main(String[] args) {
        int[] array = {4, 4, 7, 11, 7};
        int[] M = {0};
        
        int n = array.length;
        int temp ;

        //Bubble sort pentru numere pozitive
        if (M[0] > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (array[j - 1] < array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        //Bubble sort pentru numere negative
        if (M[0] <= 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        if (M[0] > 0) {
            ETICHETA1:
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == j) {
                        continue;
                    } else if (array[i] - array[j] > M[0]) { 
                        // daca conditia este indeplinita iar array-ul este ordonat descrescator 
                        //stim sigur ca urmatoarele combinatii vor oferii un rezultat mai mare decat 
                        //M asa ca il re-initializam pe j si il incrementam pe i
                        
                        // folosim label-ul ETICHETA pentru a ne putea reintoarce la primul for
                        continue ETICHETA1;              
                    } 
                    
                        // se verifica daca diferenta dintrea array[i] si array[j] ofera la iesire pe M
                    if (array[i] - array[j] == M[0]) {  
                        System.out.println(array[i] + " - " + array[j] + " = " + M[0]); // se
                    }
                }
            }
        }

        if (M[0] <= 0) {
            ETICHETA1:
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == j) {
                        continue;
                    } else if (array[i] - array[j] < M[0]) { 
                        // daca conditia este indeplinita iar array-ul este ordonat crescator                                     
                        // stim sigur ca urmatoarele combinatii vor oferii un rezultat mai mare decat 
                        // M asa ca il re-initializam pe j si il incrementam pe i
                        
                        
                        // folosim label-ul ETICHETA pentru a ne putea reintoarce la primul for
                        continue ETICHETA1;              
                    } 
                        // se verifica daca diferenta dintrea array[i] si array[j] ofera la iesire pe M
                    if (array[i] - array[j] == M[0]) {  
                        System.out.println(array[i] + " - " + array[j] + " = " + M[0]); // se
                    }
                }
            }

        }

    }

}
