public class WaterBottles {
    public static void main(String[] args) {
        System.out.println(WaterBottles.waterBottles(15, 4));
    }
    public static int waterBottles(int numBottles, int numExchange){
        int ans = numBottles;
        while(numBottles>=numExchange){
            int newBottles = numBottles/numExchange;

            int remBottles = numBottles%numExchange;
            ans = ans + newBottles;

            numBottles = newBottles + remBottles;
        }
        return ans;
    }
}
