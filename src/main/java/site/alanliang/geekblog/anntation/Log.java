package site.alanliang.geekblog.anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Descriptin 自定义日志注解
 * @Author AlanLiang
 * Date 2020/4/6 16:06
 * Version 1.0
 **/
@Target(ElementType.METHOD)//作用于方法上
@Retention(RetentionPolicy.RUNTIME)//保留至运行时
public @interface Log {
    String value() default "";
}
