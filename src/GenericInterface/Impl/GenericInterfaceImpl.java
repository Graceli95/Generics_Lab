package GenericInterface;

public class GenericInterfaceImpl <T> implements GenericInterface <T>{
    @Override
    public void print(T value) {
        System.out.println("value: " + value);
    }
}
