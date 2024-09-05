public class TaskOne {
    public TaskOne(){
        int[] numbers = {0,1,22,3};
        int sum = sumArray(numbers);
        System.out.println(sum);
    }
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
