package com.coolweather.android.gson;

/**
 * 由于JSON中的一些字段可能不太适合直接作为java字段来命名，因此这里使用了@SerializedName注解的方式来让JSON字段和java的字段
 * 建立映射关系
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String api;
        public String pm25;
    }
}
