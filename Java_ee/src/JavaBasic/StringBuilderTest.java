package JavaBasic;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        str.append('a');
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
