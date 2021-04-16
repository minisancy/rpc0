package org.san.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author gaodong
 * @version 1.0
 * @date 2021/4/16 13:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Rpc0Scan {
    /**
     * rpc0扫描的目录
     *
     * @return
     */
    String folder();
}
