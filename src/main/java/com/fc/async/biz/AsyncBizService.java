package com.fc.async.biz;

import com.fc.async.domain.entity.AsyncReq;
import com.fc.async.dto.AsyncExecDto;

/**
 * 异步执行接口
 *
 * @author xiongyan
 * @date 2021/01/08
 */
public interface AsyncBizService {

    /**
     * 执行方法
     *
     * @param asyncReq
     * @return
     */
    boolean invoke(AsyncReq asyncReq);

    /**
     * 执行方法
     *
     * @param asyncExecDto
     * @return
     */
    boolean invoke(AsyncExecDto asyncExecDto);

}
