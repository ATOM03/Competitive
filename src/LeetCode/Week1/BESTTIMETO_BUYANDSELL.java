package LeetCode.Week1;

//FaceBook Question
public class BESTTIMETO_BUYANDSELL {
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println("Max Profit = "+profit(price));
        System.out.println(profit2(price));
    }

    private static int profit(int[] price) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <price.length ; i++) {
            if(price[i]<min){
                min=price[i];
            }else{
                max=Math.max(max,price[i]-min);
            }
        }
        return max;
    }

    private static int profit2(int[] price) {
        if(price==null || price.length==0){
            return 0;
        }
        int profit=0;;
        for (int i = 0; i <price.length-1 ; i++) {
            if(price[i+1]>price[i]){
                profit+=price[i+1]-price[i];
            }
        }
        return profit;
    }
}
