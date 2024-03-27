public class Count {
public static int state(int n , int count){
    if(n == 0){
        return count;
    }
    
        if(n % 2 == 0){
            return state(n/2, ++count );
        }
        
            //n = n-1;
            //count = count + 1;
            return state( n - 1 , ++count );
        
    
    //return count;
}
    public static void main(String[] args) {
        int x = state(5,0);
        System.out.println(x);
    }




}
