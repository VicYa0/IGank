

package me.drakeet.meizhi;

import com.squareup.otto.Bus;

public class LoveBus {

    private static final Bus BUS = new Bus();


    public static Bus getLovelySeat() {return BUS;}


    private LoveBus() {}
}