package JavaBasic;

import javax.swing.text.html.parser.TagElement;

public class Son extends Father {
    public String name;
    public int age;

    public Son() {
        this.name = "erzi";
        this.age = 0;
        System.out.println("son无参构造");
    }
    public Son(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("单位上班");
    }

    public void info(){
        System.out.println("son:"+this.age);
        System.out.println("father:"+super.age);
    }
}
