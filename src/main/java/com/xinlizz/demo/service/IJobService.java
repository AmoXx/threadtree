package com.xinlizz.demo.service;

import com.xinlizz.demo.treeviews.JobBranch;

/**
 * job接口
 * @author xinlizz
 * @Date 2018/7/9
 */
public interface IJobService {
    /**
     * 解析并执行job树
     * @author xinlizz
     * @Date 2018/7/9
     * @Param [root]
     * @return void
     */
    void processJobTree(JobBranch root) throws Exception;
}
