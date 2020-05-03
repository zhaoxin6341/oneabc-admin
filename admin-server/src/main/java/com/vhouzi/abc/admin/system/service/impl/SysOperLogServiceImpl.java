package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysOperLogService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysOperLog;
import com.vhouzi.abc.system.dao.client.ISysOperLogDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 操作日志 服务层处理
 *
 * @author yiran
 */
@Service
public class SysOperLogServiceImpl implements ISysOperLogService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysOperLogDaoProvider sysOperLogDaoProvider;

    @Override
    public void insertOperlog(SysOperLog operLog) {
        sysOperLogDaoProvider.insertOperlog(operLog);
    }

    @Override
    public List<SysOperLog> selectOperLogList(SysOperLog operLog) {
        return ResultWrapperUtil.getPageData(sysOperLogDaoProvider.selectOperLogList(operLog));
    }

    @Override
    public int deleteOperLogByIds(String ids) {
        return ResultWrapperUtil.getData(sysOperLogDaoProvider.deleteOperLogByIds(ids));
    }

    @Override
    public SysOperLog selectOperLogById(Long operId) {
        return ResultWrapperUtil.getData(sysOperLogDaoProvider.selectOperLogById(operId));
    }

    @Override
    public void cleanOperLog() {
        sysOperLogDaoProvider.cleanOperLog();
    }
}
