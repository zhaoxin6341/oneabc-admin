package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysLogininforService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysLogininfor;
import com.vhouzi.abc.system.dao.client.ISysLogininforDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统访问日志情况信息 服务层处理
 *
 * @author yiran
 */
@Service
public class SysLogininforServiceImpl implements ISysLogininforService {

    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysLogininforDaoProvider sysLogininforDaoProvider;

    @Override
    public void insertLogininfor(SysLogininfor logininfor) {
        sysLogininforDaoProvider.insertLogininfor(logininfor);
    }

    @Override
    public List<SysLogininfor> selectLogininforList(SysLogininfor logininfor) {
        return ResultWrapperUtil.getData(sysLogininforDaoProvider.selectLogininforList(logininfor));
    }

    @Override
    public int deleteLogininforByIds(String ids) {
        return ResultWrapperUtil.getData(sysLogininforDaoProvider.deleteLogininforByIds(ids));
    }

    @Override
    public void cleanLogininfor() {
        sysLogininforDaoProvider.cleanLogininfor();
    }
}
