import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class Conjunto<T> {
    private static final int TAM = 10;
    private T[] array = (T[]) new Object[TAM];
    int total = 0;

    /**
     *
     * @param element a insertar
     * @return devuelve true se ha insertado y fa
     */
    public boolean insert(T element) {
        boolean isInsert = false;
        for (int i =0; i<array.length;i++) {
            if (array[i] == null) {
                array[i] = element;
                isInsert = true;
                //utilizo el break para facilitar el trabajo y simplificar el codigo
                break;
            }
        }
        return isInsert;
    }

    public boolean delete(T element) {
        boolean isTrue = false;
        for (int i = 0; i< array.length; i++) {
            if (element.equals(array[i])) {
                array[i] = null;
                isTrue = true;
            }
        }
        return isTrue;
    }
    public T get(int pos){
        return array[pos];
    }
    public int find(T element){
        int posicion=-1;
        for (int i =0; i<array.length; i++){
            if (array[i].equals(element)){
                posicion=i;
            }
        }
        return posicion;
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conjunto<?> conjunto = (Conjunto<?>) o;
        return Arrays.equals(array, conjunto.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
