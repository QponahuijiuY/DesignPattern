package com.mutong.observer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-26 12:45
 * @time_complexity: O()
 */
public class StatisticsDisplay implements Observer {
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
