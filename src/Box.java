public class Box <T,M> {
    private T name;
    private M age;

    public Box(T name, M age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }


    public static <T>T box(T name){
        return name;
    }
}
