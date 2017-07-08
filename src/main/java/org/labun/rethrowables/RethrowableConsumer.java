package org.labun.rethrowables;

import java.util.function.Consumer;

/**
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
