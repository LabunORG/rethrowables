package org.labun.rethrowables;

import lombok.SneakyThrows;

import java.util.function.Consumer;

/**
 * Similar to Consumer, but wraps checked exceptions and rethrow it as unchecked.
 *
 * @author kulabun
 */
@FunctionalInterface
public interface RethrowableConsumer<T> extends Consumer<T> {

    @SneakyThrows
    default void accept(T t) {
        doAccept(t);
    }

    void doAccept(T t) throws Exception;
}
