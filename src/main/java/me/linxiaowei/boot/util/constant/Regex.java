package me.linxiaowei.boot.util.constant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 一些常用的正则表达式
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/3/26 11:15
 */
public enum Regex {

    /**
     * 整数
     */
    INTEGER("^-?[1-9]\\d*$", "integer", "整数"),
    /**
     * 正整数
     */
    POSITIVE_INTEGER("^[1-9]\\d*$", "positive_integer", "正整数"),
    /**
     * 负整数
     */
    NEGATIVE_INTEGER("^-[1-9]\\d*$", "negative_integer", "负整数"),

    /**
     * 字母
     */
    LETTER("^[A-Za-z]+$", "letter", "字母"),
    /**
     * 小写字母
     */
    LETTER_LOWER("^[a-z]+$", "letter", "小写字母"),
    /**
     * 大写字母
     */
    LETTER_UPPER("^[A-Z]+$", "letter", "大写字母"),
    ;

    private String value;
    private String desc;
    private String descZh;

    Regex(String value, String desc, String descZh) {
        this.value = value;
        this.desc = desc;
        this.descZh = descZh;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public String getDescZh() {
        return descZh;
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(INTEGER.value);
        Matcher m = pattern.matcher("-123456789012345678790");
        System.out.println(m.matches());
    }

}
