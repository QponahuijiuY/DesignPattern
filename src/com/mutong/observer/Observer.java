package com.mutong.observer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-26 12:40
 * @time_complexity: O()
 */

//观察者
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
