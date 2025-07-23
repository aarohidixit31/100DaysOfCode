public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci.fibonacci(2);
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int ft=0;
            int st=1;
            for(int i=1;i<=n;i++){
                int tt= ft+st;

                ft=st;
                st=tt;
            }
            return ft;
        }
    }
}
