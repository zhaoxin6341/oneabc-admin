package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysUserOnlineService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysUserOnline;
import com.vhouzi.abc.system.dao.client.ISysUserOnlineDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 在线用户 服务层处理
 *
 * @author yiran
 */
@Service
public class SysUserOnlineServiceImpl implements ISysUserOnlineService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysUserOnlineDaoProvider sysUserOnlineDaoProvider;

    @Override
    public SysUserOnline selectOnlineById(String sessionId) {
        return ResultWrapperUtil.getData(sysUserOnlineDaoProvider.selectOnlineById(sessionId));
    }

    @Override
    public void deleteOnlineById(String sessionId) {
        sysUserOnlineDaoProvider.deleteOnlineById(sessionId);
    }

    @Override
    public void batchDeleteOnline(List<String> sessions) {
        sysUserOnlineDaoProvider.batchDeleteOnline(sessions);
    }

    @Override
    public void saveOnline(SysUserOnline online) {
        sysUserOnlineDaoProvider.saveOnline(online);
    }

    @Override
    public List<SysUserOnline> selectUserOnlineList(SysUserOnline userOnline) {
        return ResultWrapperUtil.getData(sysUserOnlineDaoProvider.selectUserOnlineList(userOnline));
    }

    @Override
    public void forceLogout(String sessionId) {
        sysUserOnlineDaoProvider.forceLogout(sessionId);
    }

    @Override
    public List<SysUserOnline> selectOnlineByExpired(Date expiredDate) {
        return ResultWrapperUtil.getData(sysUserOnlineDaoProvider.selectOnlineByExpired(expiredDate));
    }
}
