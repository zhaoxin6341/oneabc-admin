package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysPostService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysPost;
import com.vhouzi.abc.system.dao.client.ISysPostDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 岗位信息 服务层处理
 *
 * @author yiran
 */
@Service
public class SysPostServiceImpl implements ISysPostService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysPostDaoProvider sysPostDaoProvider;

    @Override
    public List<SysPost> selectPostList(SysPost post) {
        return ResultWrapperUtil.getPageData(sysPostDaoProvider.selectPostList(post));
    }

    @Override
    public List<SysPost> selectPostAll() {
        return ResultWrapperUtil.getData(sysPostDaoProvider.selectPostAll());
    }

    @Override
    public List<SysPost> selectPostsByUserId(Long userId) {
        return ResultWrapperUtil.getData(sysPostDaoProvider.selectPostsByUserId(userId));
    }

    @Override
    public SysPost selectPostById(Long postId) {
        return ResultWrapperUtil.getData(sysPostDaoProvider.selectPostById(postId));
    }

    @Override
    public int deletePostByIds(String ids) throws Exception {
        return ResultWrapperUtil.getData(sysPostDaoProvider.deletePostByIds(ids));
    }

    @Override
    public int insertPost(SysPost post) {
        return ResultWrapperUtil.getData(sysPostDaoProvider.insertPost(post));
    }

    @Override
    public int updatePost(SysPost post) {
        return ResultWrapperUtil.getData(sysPostDaoProvider.updatePost(post));
    }

    @Override
    public int countUserPostById(Long postId) {
        return ResultWrapperUtil.getData(sysPostDaoProvider.countUserPostById(postId));
    }

    @Override
    public String checkPostNameUnique(SysPost post) {
        return ResultWrapperUtil.getData(sysPostDaoProvider.checkPostNameUnique(post));
    }

    @Override
    public String checkPostCodeUnique(SysPost post) {
        return ResultWrapperUtil.getData(sysPostDaoProvider.checkPostCodeUnique(post));
    }
}
