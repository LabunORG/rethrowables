package org.labun.rethrowables;

import java.util.concurrent.Callable;

/**
 * @author kulabun
 */
@FunctionalInterface
public interface RethrowableCallable<R> extends Callable<R> {
    default R call() {
        try {
            return doCall();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    R doCall() throws Exception;
}
