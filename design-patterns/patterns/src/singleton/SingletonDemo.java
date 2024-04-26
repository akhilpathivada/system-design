/**
 * Date 09/04/24
 *
 * @author akhilpathivada
 */
package singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        LoggerSingletonEager loggerSingleton1 = LoggerSingletonEager.getInstance();
        System.out.println(loggerSingleton1);
        LoggerSingletonEager loggerSingleton2 = LoggerSingletonEager.getInstance();
        System.out.println(loggerSingleton2);
        LoggerSingletonLazy loggerSingletonLazy1 = LoggerSingletonLazy.getInstance();
        System.out.println(loggerSingletonLazy1);
        LoggerSingletonLazy loggerSingletonLazy2 = LoggerSingletonLazy.getInstance();
        System.out.println(loggerSingletonLazy2);
    }
}
