import java.util.Random;

public class Executable {

    static int[] array1;
    static int[] array2;
    static int[] array3;
    static Random random;

    public static void main(String[] args){
        initializer();
    }

    public static void initializer(){
        array1 = new int[10];
        array2 = new int[10];
        array3 = new int[10];

        createArray(array1);
        createArray(array2);
        createArray(array3);
        methods();
    }

    public static void methods(){
        bubble(array1);
        selection(array2);
        insertion(array3);
    }


    public static int[] bubble(int[] array){
        int n = array.length;
        System.out.println("Bubble:");

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println(toString(array));
        }
        return array;
    }

    public static int[] selection(int[] array){
        int n = array.length;
        System.out.println("Selection:");

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

            System.out.println(toString(array));
        }

        return array;
    }

    public static int[] insertion(int[] array){
        int n = array.length;
        System.out.println("Insertion:");

        for(int i = 1; i < n; i++){
            int  key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
            System.out.println(toString(array));
        }

        return array;
    }

    public static void createArray(int[] array){
        random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
    }

    public static String toString(int[] array){
        String str = "";
        for(int i = 0; i < array.length; i++){
            str += array[i] + " ";
        }
        return str;
    }
}
