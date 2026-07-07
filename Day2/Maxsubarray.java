package Day2;

public class Maxsubarray {
    public static int MaxSub(int[] nums){
int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];

                }
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[]={1,-1,2,3,4,-6,-9,1};
        System.out.println(MaxSub(arr));
    }
}
