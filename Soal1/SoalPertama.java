package Soal1;
public class SoalPertama {
    public static void main(String[] args){
        int[] array = {1,2,3};
        int sum = sumArray (array);
        System.out.println(sum);
    }
    public static int sumArray(int[] arr){
        int total = 0;
        for(int number : arr){
            total += number;
        }
        return total;
    }
}