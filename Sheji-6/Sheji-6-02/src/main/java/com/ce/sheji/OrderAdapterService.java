package com.ce.sheji;

/**
 * @author c__e
 * @date 2021/8/26 14:12
 */
public interface OrderAdapterService {
    /**
     * 判断是否首单
     */
    boolean isFirst(String uId);
}
