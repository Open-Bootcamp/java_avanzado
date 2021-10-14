package sesion3;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sesion3 {
    public Function<Integer,Integer> sumaFuncionalVariable = x -> IntStream.rangeClosed(1, x).reduce(0, (a, b) -> a + b);

    public static int factorialIterativo(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++ ) {
            resultado *= i;
        }

        return resultado;
    }

    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }

        // Usando "tail recursion":
        return n * factorialRecursivo(n-1);
    }

    public static int factorialFuncional(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    public static int sumaIterativa(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            result += i;
        }

        return result;
    }

    public static int sumaRecursiva(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumaRecursiva(n - 1);
    }

    public static int sumaFuncional(int n) {
        return IntStream.rangeClosed(1, n).reduce(0, (a, b) -> a + b);
    }


    public static IntStream fibonacciFuncional(int max) {
        return Stream.iterate(
                new int[]{1, 1},
                fib -> new int[] {fib[1], fib[0] + fib[1]}
        ).mapToInt(fib -> fib[0]);
    }
}
