package com.dailin.command;

/**
 * 调用者：服务员
 *
 * @author huangdailin on 2019/7/31 16:33
 * @version 1.0
 */
public class Waiter {
    private Breakfast changfen, huntun, hefen;

    public void setChangfen(Breakfast changfen) {
        this.changfen = changfen;
    }

    public void setHuntun(Breakfast huntun) {
        this.huntun = huntun;
    }

    public void setHefen(Breakfast hefen) {
        this.hefen = hefen;
    }

    public void chooseChangFen() {
        changfen.cooking();
    }

    public void chooseHunTun() {
        huntun.cooking();
    }

    public void chooseHeFen() {
        hefen.cooking();
    }
}
