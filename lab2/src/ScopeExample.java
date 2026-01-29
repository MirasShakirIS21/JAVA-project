public class ScopeExample {

    int classVariable = 50; 
    void showVariables() {
        int localVariable = 10;

        System.out.println("Class field: " + classVariable);
        System.out.println("Local variable: " + localVariable);
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.showVariables();
    }
}
