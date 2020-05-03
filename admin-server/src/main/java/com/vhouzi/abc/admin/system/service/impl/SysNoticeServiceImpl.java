package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysNoticeService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysNotice;
import com.vhouzi.abc.system.dao.client.ISysNoticeDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公告 服务层实现
 *
 * @author yiran
 * @date 2018-06-25
 */
@Service
public class SysNoticeServiceImpl implements ISysNoticeService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysNoticeDaoProvider sysNoticeDaoProvider;

    @Override
    public SysNotice selectNoticeById(Long noticeId) {
        return ResultWrapperUtil.getData(sysNoticeDaoProvider.selectNoticeById(noticeId));
    }

    @Override
    public List<SysNotice> selectNoticeList(SysNotice notice) {
        return ResultWrapperUtil.getData(sysNoticeDaoProvider.selectNoticeList(notice));
    }

    @Override
    public int insertNotice(SysNotice notice) {
        return ResultWrapperUtil.getData(sysNoticeDaoProvider.insertNotice(notice));
    }

    @Override
    public int updateNotice(SysNotice notice) {
        return ResultWrapperUtil.getData(sysNoticeDaoProvider.updateNotice(notice));
    }

    @Override
    public int deleteNoticeByIds(String ids) {
        return ResultWrapperUtil.getData(sysNoticeDaoProvider.deleteNoticeByIds(ids));
    }
}
