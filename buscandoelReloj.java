import java.util.ArrayList;
import java.util.List;

public class buscandoelReloj {
    public static void main(String[] args) {
        final List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>());
        matriz.get(0).add(1);
        matriz.get(0).add(1);
        matriz.get(0).add(1);
        matriz.get(0).add(0);
        matriz.get(0).add(0);
        matriz.get(0).add(0);
        matriz.add(new ArrayList<>());
        matriz.get(1).add(0);
        matriz.get(1).add(1);
        matriz.get(1).add(0);
        matriz.get(1).add(0);
        matriz.get(1).add(0);
        matriz.get(1).add(0);
        matriz.add(new ArrayList<>());
        matriz.get(2).add(1);
        matriz.get(2).add(1);
        matriz.get(2).add(1);
        matriz.get(2).add(0);
        matriz.get(2).add(0);
        matriz.get(2).add(0);
        matriz.add(new ArrayList<>());
        matriz.get(3).add(0);
        matriz.get(3).add(0);
        matriz.get(3).add(2);
        matriz.get(3).add(4);
        matriz.get(3).add(4);
        matriz.get(3).add(0);
        matriz.add(new ArrayList<>());
        matriz.get(4).add(0);
        matriz.get(4).add(0);
        matriz.get(4).add(0);
        matriz.get(4).add(2);
        matriz.get(4).add(0);
        matriz.get(4).add(0);
        matriz.add(new ArrayList<>());
        matriz.get(5).add(0);
        matriz.get(5).add(0);
        matriz.get(5).add(1);
        matriz.get(5).add(2);
        matriz.get(5).add(4);
        matriz.get(5).add(0);

        List<Integer> clock = getClock(matriz, 0, 1);
        for (int i = 0; i < clock.size(); i++) {
            System.out.print(clock.get(i));
        }

    }

    public static List<Integer> getClock(List<List<Integer>> matriz, int fila, int columna) {
        List<Integer> reloj = new ArrayList<>();

        reloj.add(matriz.get(fila).get(columna));

        reloj.add(matriz.get(fila).get(columna + 1));

        reloj.add(matriz.get(fila).get(columna + 2));

        reloj.add(matriz.get(fila + 1).get(columna + 1));

        reloj.add(matriz.get(fila + 2).get(columna));

        reloj.add(matriz.get(fila + 2).get(columna + 1));

        reloj.add(matriz.get(fila + 2).get(columna + 2));

        return reloj;

    }

    public static Integer sumadeCLock(List<Integer> clock) {
        int suma = 0;
        for (int i = 0; i < clock.size(); i++) {
            suma += clock.get(i);
        }
        return suma;

    }
}
