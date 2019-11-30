package com.dailin.singleton;

/**
 * 懒汉式单例模式
 *
 * @author huangdailin on 2019年11月30日  14:17
 * @version 1.0
 */
public class LazySingleton {
    /**
     * 保证instance在所以线程中同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * private 避免在外部被实例化
     */
    private LazySingleton() {
        System.out.println("产生一个总统！");
    }

    /**
     * 静态公有方法
     *
     * @return 实例对象
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        } else{
            System.out.println("已经有了一个总统，不能产生新总统！");
        }
        return instance;
    }
}
