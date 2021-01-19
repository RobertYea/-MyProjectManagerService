package com.yq.myProjectManagerService.v1.utils;

import java.util.UUID;

/**
 * UuidUtils
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/19
 */
public final class UUIDUtils {

    /**
     * 带 - 的UUID
     *
     * @return String
     */
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

    /**
     * 不带 - 的UUID
     *
     * @return String
     */
    public static String getContinuouslyUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
