package org.labun.rethrowables;

/**
 * Similar to simple Runnable, but wraps checked exceptions and rethrow it as unchecked.
 *
 * @author kulabun
 */
@FunctionalInterface
public interface RethrowableRunnable extends Runnable {
    default void run() {
        try {
            doRun();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void doRun() throws Exception;
}
