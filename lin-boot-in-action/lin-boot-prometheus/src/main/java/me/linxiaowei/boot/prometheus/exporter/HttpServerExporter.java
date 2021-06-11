package me.linxiaowei.boot.prometheus.exporter;

import io.prometheus.client.exporter.HTTPServer;

import java.io.IOException;

/**
 * HttpServerExporter
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/11 10:51
 */
public class HttpServerExporter implements Runnable {

    private static final int PORT = 9000;

    @Override
    public void run() {
        try {
            new HTTPServer(PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
