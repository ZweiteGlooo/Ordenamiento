import java.util.Random;

public class Executable {

    static int[] array;
    static Random random;

    public static void main(String[] args){
        initializer();
    }

    public static void initializer(){
        array = new int[10];
        createArray(array);
        methods();
    }

    public static void methods(){
        bubble();
        selection();
        insertion();
    }


    public static int[] bubble(int[] array){
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

    public static int[] selection(int[] array){
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

    public static int[] insertion(int[] array){
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

    public static void createArray(int[] array){
        random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
    }
}
