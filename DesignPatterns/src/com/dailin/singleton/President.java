package com.dailin.singleton;

/**
 * 描述
 *
 * @author huangdailin on 2019年11月30日  15:15
 * @version 1.0
 */
public class President {
    public static void main(String[] args) {
        //懒汉单例实现
        lazy();

        //饿汉单例实现
        hungry();
    }

    private static void hungry() {
        HungrySingleton president1 = HungrySingleton.getInstance();
        HungrySingleton president2 = HungrySingleton.getInstance();
    }

    private static void lazy() {
        LazySingleton president1 = LazySingleton.getInstance();
        LazySingleton president2 = LazySingleton.getInstance();
        if (president1 == president2) {
            System.out.println("是同一个人");
        } else {
            System.out.println("不是同一个人");
        }
    }
}
