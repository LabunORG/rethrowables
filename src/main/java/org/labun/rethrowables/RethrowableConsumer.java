package org.labun.rethrowables;

import java.util.function.Consumer;

/**
 * Similar to Consumer, but wraps checked exceptions and rethrow it as unchecked.
 *
 * @author kulabun
 */
@FunctionalInterface
public interface RethrowableConsumer<T> extends Consumer<T> {
    default void accept(T t) {
        try {
            doAccept(t);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void doAccept(T t) throws Exception;
}
