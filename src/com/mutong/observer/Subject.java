package com.mutong.observer;



/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-26 12:39
 * @time_complexity: O()
 */

//被观察对象接口
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
