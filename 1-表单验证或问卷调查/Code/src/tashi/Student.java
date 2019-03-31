package tashi;


import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter@Setter
public class Student {
    private String sex; //性别
    private String[] fruit; //水果
    private int from;//城市编号
    private String evaluate; //评价
    private int phone; //手机号
    @Override
    public String toString() {
        return "Student{" +
                "sex='" + sex + '\'' +
                ", fruit=" + Arrays.toString(fruit) +
                ", from=" + from +
                ", evaluate='" + evaluate + '\'' +
                ", phone=" + phone +
                '}';
    }
}
