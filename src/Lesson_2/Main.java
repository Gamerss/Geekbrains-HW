package Lesson_2;

public class Main {
    public static void main(String[] args) {
        invertArray();
        System.out.println("");
        fillArray();
        System.out.println("");
        changeArray();
        System.out.println("");
        fillDiagonal();
        System.out.println("");





    }
    public static void invertArray(){
        int arr[]={1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                arr[i]= 0;
            }else {
                arr[i]= 1;
            }
            System.out.println(arr[i]);

        }


    }

    public static void fillArray(){
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
        arr[i]= i * 3;
            System.out.println(arr[i]);

        }
    }

    public static void changeArray(){
        int arr[]={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6){
                arr[i]=arr[i] * 2;
            }else{

            }
            System.out.println(arr[i]);

        }



    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if( i == j||i == arr.length-j-1){
                    arr[i][j] = 1;
                }else {

                }

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();




        }



    }





}



