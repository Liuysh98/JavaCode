package beginning;

public class Code2_RightOne {
    public static int rightOne(int all){
        return all & (~all+1);  //正常取反再与，会消成0，因为加了1，可以把最右边不为零单独改掉，最终凸显出来
    }
}
