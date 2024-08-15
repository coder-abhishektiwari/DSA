
public class checkprime {
    public static void main(String[] args){
        int n = 91;
        int count = 0 ;
        for (int i=n-1; i>2; i--){
          if(n%i==0){
            count = count + 1;
          }
        }
        if(count==0){
            System.out.println("numer is prime");
        }else{
            System.out.println("number is not prime");
        }
        
    }
}

