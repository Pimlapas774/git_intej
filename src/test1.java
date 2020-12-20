public class test1 {
    private String name;

    public test1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello "+name+",Welcome to github.";
    }
}
