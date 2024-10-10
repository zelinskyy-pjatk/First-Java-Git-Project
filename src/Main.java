//TODO: we need to add 2 more additional classes, to get rid of errors\

//OK, I will add "Adder" class and s31519 will add "Subtractor" class

public
    class Main{
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6,3));

    }
}
