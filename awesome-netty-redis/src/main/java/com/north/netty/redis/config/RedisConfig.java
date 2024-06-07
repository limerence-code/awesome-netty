package com.north.netty.redis.config;

/**
 * @author laihaohua
 */
public class RedisConfig {
    public static String host = "10.66.0.11";

    public static String passwd = "123456";

    /*public static String host = "10.10.103.15";
    public static String passwd = "SJ(Qu%(kfXQBjxyT";*/
    public static int port = 6379;
    /**
     * 每个client创建的连接数
     */
    public static int connectionCount = 10;

    /**
     * 超时时间 ms
     */
    public static int TIME_OUT_MS =  5000;
}
