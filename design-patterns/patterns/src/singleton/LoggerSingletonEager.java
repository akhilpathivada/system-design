/**
 * Date 09/04/24
 *
 * @author akhilpathivada
 */
package singleton;

public class LoggerSingletonEager {

    private static LoggerSingletonEager instance = new LoggerSingletonEager();

    public static LoggerSingletonEager getInstance() {
        return instance;
    }

    private LoggerSingletonEager() {

    }
}
