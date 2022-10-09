class Test {
    int x;
    int y;    
    private Test() {
        x = 10;
        y = 20;
    }
    public static Test getObject() {
        return new Test();
    }
}

class StaticFactoryMethod {
    public static void main (String[] args) {
        Test t = Test.getObject();
            System.out.println("X: " + t.x);
            System.out.println("Y: " + t.y);
    }
}
