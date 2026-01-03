Class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-->0){
      int n = sc.nextInt();
    System.out.println(sumOfDigits(n));
    }
  }
  public static int sumOfDigits(int n){
    if(n<0){
    return -sumOfDigits(-n);
  }
  if(n==0){
    return 0;
  }
  return n%10 + sumOfDigits(n/10);
}
}
