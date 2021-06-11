package me.linxiaowei.boot.prometheus.helper;

import java.util.Date;
import java.util.Random;

/**
 * MockHttpRequest
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/11 11:01
 */
public class MockRequest implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(5 * 1000));
                System.out.println("发起新请求 - now=" + new Date());
                handle();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void handle() {
    }

}
