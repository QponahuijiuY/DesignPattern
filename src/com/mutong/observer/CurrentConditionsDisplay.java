package com.mutong.observer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-26 12:46
 * @time_complexity: O()
 */
public class CurrentConditionsDisplay implements Observer {
    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
