import java.util.Arrays;

public class MetodoOrdenamiento {

   
    public int[] sortInsertion(int[] arreglo, boolean logs) {
        if (logs) {
            System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        }
        
        int n = arreglo.length;

        
        for (int i = 1; i < n; i++) {
            if (logs) {
                System.out.println("Pasada número " + i);
            }

           
            int now = arreglo[i];

            
            int j = i - 1;

            if (logs) {
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            }

        
            while (j >= 0 && arreglo[j] > now) {
                if (logs) {
                    System.out.println("\t\tComparamos " + now + " con " + arreglo[j]);
                }

                arreglo[j + 1] = arreglo[j];
                j--;

                if (logs) {
                    System.out.println("\t\t--------" + Arrays.toString(arreglo));
                }
            }

        
            arreglo[j + 1] = now;

            if (logs) {
                System.out.println("\t--------" + Arrays.toString(arreglo));
            }
        }

        return arreglo;
    }

    public void printArray(int[] arreglo) {
        System.out.println("\nResultado");
        System.out.println(Arrays.toString(arreglo));
    }
}