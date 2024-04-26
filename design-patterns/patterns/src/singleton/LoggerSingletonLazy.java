/**
 * Date 09/04/24
 *
 * @author akhilpathivada
 */
package singleton;

public class LoggerSingletonLazy {

    private static LoggerSingletonLazy instance = null;

    public static LoggerSingletonLazy getInstance() {
        if (instance == null) {
            instance = new LoggerSingletonLazy();
        }
        return instance;
    }

    private LoggerSingletonLazy() {

    }
}
