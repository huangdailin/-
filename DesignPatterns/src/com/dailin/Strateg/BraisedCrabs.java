package com.dailin.Strateg;

/**
 * 具体策略类：红烧大闸蟹
 *
 * @author huangdailin on 2019/8/4 15:18
 * @version 1.0
 */
public class BraisedCrabs implements CrabCooking {
    @Override
    public void CookingMethod() {
        System.out.println("红烧大闸蟹！");
    }
}
