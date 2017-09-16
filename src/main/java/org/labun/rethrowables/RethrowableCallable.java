package org.labun.rethrowables;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;

/**
 * Similar to Callable, but wraps checked exceptions and rethrow it as unchecked.
 *
 * @author kulabun
 */
@FunctionalInterface
public interface RethrowableCallable<R> extends Callable<R> {

    @SneakyThrows
    default R call() {
        return doCall();
    }

    R doCall() throws Exception;
}
