class LastNonZeroOfFactorial {
 
    // Method to find factorial of the given number
    static int factorial(int n)
    {
        if(n==0 || n==1)
        return 1;
        
        return n*factorial(n-1);
    }
 
    // Driver method
    public static void main(String[] args)
    {
        int num = 5;
        int fact = factorial(num);
        
        int res;
        
        while(fact%10==0){
            fact /=10;
        }
        
        System.out.println(fact%10);
    }
}