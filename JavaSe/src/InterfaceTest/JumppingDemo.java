package InterfaceTest;

class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Jumpping(){
            @Override
            public void jump() {
                System.out.println("jump!");
            }
        };
        jo.method(j);
    }
}

