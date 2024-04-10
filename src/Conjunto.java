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

    /**
     *
     * @param element para borrar
     * @return true si ha borrado o false si no
     */
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

    /**
     *
     * @param pos
     * @return valor de la posición introducida
     */
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
    //Override

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
        for (int i = 0; i< array.length; i++){
            if(array[i] != ((Conjunto<?>) o).array[i]){
                return false;
            }
        }

        return true;
    }

}
