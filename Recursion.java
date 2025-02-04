class Recursion{ 
public static void main (String args[]) {
     rev(1234567);
    System.out.println(sum);

}
/* static int func(int n){
    if(n<=1){
        return 1 ;
    }
    System.out.println(n);
    return n+func(n-1);
} */

/* static int func(int n){
    if(n==0){
        return 0 ;
    }
    System.out.println(n);
    return func(n-1);
} */

static int  sum=0;
static void rev(int n){
    if(n==0){
        return  ;
    }
    int rem=n%10;
    sum=sum*10+rem;
    rev(n/10);

   
}

} 