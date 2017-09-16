package org.labun.rethrowables;

import lombok.SneakyThrows;

import java.util.function.Function;

/**
 * Similar to Function, but wraps checked exceptions and rethrow it as unchecked.
 *
 * @author kulabun
 */
@FunctionalInterface
public interface RethrowableFunction<T, R> extends Function<T, R> {

    @SneakyThrows
    default R apply(T t) {
        return doApply(t);
    }

    R doApply(T t) throws Exception;
}
