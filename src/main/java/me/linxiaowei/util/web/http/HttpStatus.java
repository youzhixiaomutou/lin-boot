package me.linxiaowei.util.web.http;

/**
 * HttpStatus
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2020/9/4 15:47
 * @see <a href="https://github.com/spring-projects/spring-framework/blob/master/spring-web/src/main/java/org/springframework/http/HttpStatus.java></a>
 */
public enum HttpStatus {

    // 1xx Informational

    /**
     * {@code 100 Continue}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.2.1">HTTP/1.1: Semantics and Content, section 6.2.1</a>
     */
    CONTINUE(100, "Continue");

    private final int value;
    private final String description;

    HttpStatus(int value, String description) {
        this.value = value;
        this.description = description;

    }

}
