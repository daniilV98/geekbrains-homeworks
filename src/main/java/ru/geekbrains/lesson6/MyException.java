package ru.geekbrains.lesson6;

public class MyException {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arr = new String[4][4]; // при смене размера массива, вызов MyArraySizeException
        arr[0][0] = "1";
        arr[0][1] = "2";
        arr[1][1] = "2";
        arr[0][2] = "2fdfgh";     // тест для MyArrayDataException



        System.out.println("Сумма массива: " + new MyException().array(arr));
    }

    private int array(String[][] myArr) throws MyArraySizeException, MyArrayDataException {
        int row = myArr.length;
        int column = myArr[0].length;

        if (row != 4 | column != 4) {
            throw new MyArraySizeException(" Размер массива не 4х4");
        }

        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                try {
                    if (myArr[i][j] != null) {
                        sum += Integer.parseInt(myArr[i][j]);
                    }
                } catch (Exception e) {
                    throw new MyArrayDataException("в [" + i + "],[" + j + "] не int");
                }
            }
        }
        return sum;
    }
}
