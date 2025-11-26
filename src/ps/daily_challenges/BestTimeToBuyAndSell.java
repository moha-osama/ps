package ps.daily_challenges;

public class BestTimeToBuyAndSell {
    public static int maxSum(int arr[], int k){
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length - k; i++){
            int current_sum = 0;
            for(int j = 0; j < k; j++){
                current_sum += arr[i + j];
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}
