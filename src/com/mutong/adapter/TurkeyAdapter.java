package com.mutong.adapter;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/25 10:52
 * @time_complexity: O()
 */
public class TurkeyAdapter implements Duck {
        Turkey turkey;
        public TurkeyAdapter(Turkey turkey){
            this.turkey=turkey;
        }
        @Override
        public void quack() {
            turkey.gobble();
        }

}
