package com.dailin.singleton;

/**
 * 静态内部类单例模式
 *
 * @author huangdailin on 2019年11月30日  14:45
 * @version 1.0
 */
public class InnerSingleton {
    /**
     * 私有构造方法
     */
    private InnerSingleton() {}

    /**
     * 静态内部类
     */
    private static class Inner {
        private static final InnerSingleton instance = new InnerSingleton();
    }

    /**
     * 静态公有方法
     *
     * @return 实例对象
     */
    public static InnerSingleton getInstance() {
        return Inner.instance;
    }
}
