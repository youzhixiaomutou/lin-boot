package me.linxiaowei.boot.prometheus.metric;

import io.prometheus.client.Counter;
import io.prometheus.client.exporter.HTTPServer;

import java.io.IOException;

/**
 * Counter
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/11 10:59
 */
public class CounterTest {

    private static final Counter req = Counter.build().name("requests_total").help("Total requests.").register();

    public static void main(String[] args) {
        req.inc();
        try {
            new HTTPServer(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
