package com.dailin.singleton;

/**
 * 饿汉式单例模式
 *
 * @author huangdailin on 2019年11月30日  14:36
 * @version 1.0
 */
public class HungrySingleton {
    /**
     * 类加载就创建单例
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * 私有构造方法
     */
    private HungrySingleton(){
        System.out.println("产生一个总统！");
    }

    /**
     * 静态公有方法
     *
     * @return 实例对象
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
