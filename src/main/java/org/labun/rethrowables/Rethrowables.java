package org.labun.rethrowables;

/**
 * Utility class aggregates functions to wrap methods with throws clause.
 *
 * @author kulabun
 */
public class Rethrowables {
    private Rethrowables() {
    }

    public static void run(RethrowableRunnable runnable) {
        runnable.run();
    }

    public static <R> R call(RethrowableCallable<R> callable) {
        return callable.call();
    }

    public static <T, R> R invoke(T t, RethrowableFunction<T, R> function) {
        return function.apply(t);
    }

    public static <T> void accept(T t, RethrowableConsumer<T> consumer) {
        consumer.accept(t);
    }
}
