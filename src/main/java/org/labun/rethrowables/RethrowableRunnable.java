package org.labun.rethrowables;

import lombok.SneakyThrows;

/**
 * Similar to simple Runnable, but wraps checked exceptions and rethrow it as unchecked.
 *
 * @author kulabun
 */
@FunctionalInterface
public interface RethrowableRunnable extends Runnable {

    @SneakyThrows
    default void run() {
        doRun();
    }

    void doRun() throws Exception;
}
