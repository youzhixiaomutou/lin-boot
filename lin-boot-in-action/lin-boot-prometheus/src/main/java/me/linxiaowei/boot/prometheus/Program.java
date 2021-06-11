package me.linxiaowei.boot.prometheus;

import me.linxiaowei.boot.prometheus.exporter.HttpServerExporter;
import me.linxiaowei.boot.prometheus.helper.MockRequest;

/**
 * Program
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/11 10:46
 */
public class Program {

    public static void main(String[] args) {
        Thread tExporter = new Thread(new HttpServerExporter());
        tExporter.start();
        Thread tMock = new Thread(new MockRequest());
        tMock.start();
    }

}
