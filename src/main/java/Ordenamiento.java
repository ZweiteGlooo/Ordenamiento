import java.util.Random;

public class Ordenamiento {



    public int[] bubble(int[] array){
        int n = array.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public int[] selection(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp =  array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }

    public int[] insertion(int[] array){
        int n = array.length;

        for(int i = 1; i < n; i++){
            int  key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }

        return array;
    }

    public void createArray(int[] array){
        random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
    }

    public String toString(int[] array){
        String str = "";
        for(int i = 0; i < array.length; i++){
            str += array[i] + " ";
        }
        return str;
    }
}
