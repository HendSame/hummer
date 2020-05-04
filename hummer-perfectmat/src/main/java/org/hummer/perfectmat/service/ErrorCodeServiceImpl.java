package org.hummer.perfectmat.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.hummer.common.TimeUtils;
import org.hummer.perfectmat.ErrorCodeUtil;
import org.hummer.perfectmat.PafAccessData;
import org.hummer.perfectmat.PafBusinessType;
import org.hummer.perfectmat.ResourceQuotas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;

/**
 * 错误码统一处理
 *
 * @author zhujinming6
 * @create 2018-07-11 19:02
 * @update 2018-07-11 19:02
 **/
@Service
public class ErrorCodeServiceImpl implements ErrorCodeService {

    private Logger log = LoggerFactory.getLogger(ErrorCodeServiceImpl.class);


    @Resource
    PropertiesService propertiesService;

    /**
     * 正常时统一处理
     *
     * @param status, 保存状态属性
     *                code
     *                错误码
     * @return void
     * @author zhujinming6
     * @create_date 2018/7/11 18:58
     * @modify_date 2018/7/11 18:58
     */
    @Override
    public void normal(Map<String, Object> status) {
        ErrorCodeUtil.normal(status);
    }

    @Override
    public void singleResource(Map<String, Object> status, String code, PafAccessData accessData, String businessType) {
        ErrorCodeUtil.singleResource(status, code, accessData, businessType);
    }


    /**
     * 单一状态 探针 错误码处理
     *
     * @param status
     * @param code
     * @param accessData
     * @param businessType
     */
    @Override
    public void singleCustomResource(String resourceType, Map<String, Object> status, String code, PafAccessData accessData, PafBusinessType businessType, JsonNode dataObject) {
        ErrorCodeUtil.singleCustomResource(resourceType, status, code, accessData, businessType, dataObject);
    }

    /**
     * snmp  错误码处理
     *
     * @param status
     * @param code
     * @param jsonObject
     */
    @Override
    public boolean snmpErrorCode(Map<String, Object> status, String code, JsonNode jsonObject, String businessType) {
        return  false;
    }

    @Override
    public void defaultOfflineReason(Map<String, Object> status, int onlineStatus) {
    }

}