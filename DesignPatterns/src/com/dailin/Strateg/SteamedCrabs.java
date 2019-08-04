package com.dailin.Strateg;

/**
 * 具体策略类：清蒸大闸蟹
 *
 * @author huangdailin on 2019/8/4 15:17
 * @version 1.0
 */
public class SteamedCrabs implements CrabCooking {
    @Override
    public void CookingMethod() {
        System.out.println("清蒸大闸蟹！");
    }
}
