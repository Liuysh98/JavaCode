package JavaBasic;

public class Father {
    public String name;
    public int age;

    public Father() {
        this.age = 50;
        this.name = "fuqin";
        System.out.println("father无参构造");
    }

    public Father(String name, int age) {
        this.name = "liuenyi";
        this.age = 50;
    }


    public void work() {
        System.out.println("挖矿");
    }
    private void hobby(){
        System.out.println("抽烟");
    }

    public static void main(String[] args) {
        Father liu = new Father();
        liu.hobby();
    }
}
