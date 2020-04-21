package com.mutong.adapter;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-12 13:37
 * @time_complexity: O()
 */
public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void headleRequest() {
        super.request();//可以上网了
    }
}
