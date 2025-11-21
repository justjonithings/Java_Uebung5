package h1;

public class H1_main {
    public static void main(String[] args) {

        int[] myArray = {5, 6, 7, 10};

        int[] temp;
        temp = new int[myArray.length];

        int i = 1;

        while (i <= myArray.length) {
            temp[i-1] = myArray[myArray.length - i];
            i++;
        }

        myArray = temp;

    }

}