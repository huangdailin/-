package com.dailin.command;

/**
 * 馄饨类
 *
 * @author huangdailin on 2019/7/31 16:21
 * @version 1.0
 */
public class HunTun implements Breakfast {
    private HunTunChef hunTunChef;
    HunTun(){
        hunTunChef = new HunTunChef();
    }
    @Override
    public void cooking() {
        hunTunChef.cooking();
    }
}
