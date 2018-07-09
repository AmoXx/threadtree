package com.xinlizz.demo.service.impl;

import com.xinlizz.demo.enums.BranchTypeEnum;
import com.xinlizz.demo.enums.JobRunType;
import com.xinlizz.demo.factory.JobFactory;
import com.xinlizz.demo.job.AbstractJob;
import com.xinlizz.demo.run.Run;
import com.xinlizz.demo.run.SerialRunStrategy;
import com.xinlizz.demo.service.IJobService;
import com.xinlizz.demo.treeviews.JobBranch;
import com.xinlizz.demo.utils.StringUtils;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/***
 * job实现类
 * @author xinlizz
 * @Date 2018/7/9
 */
public class JobServiceImpl implements IJobService {

    private ExecutorService executorService = Executors.newCachedThreadPool();

    public void processJobTree(JobBranch root) throws Exception {

        if (StringUtils.equals(BranchTypeEnum.BRANCH_ROOT.getType(), root.getType())) {
            recursionProcess(root);
        }
    }

    private void recursionProcess(JobBranch jobBranch) throws Exception {
        final JobFactory factory = JobFactory.getInstance();
        List<JobBranch> children = jobBranch.getChildren();
        if (StringUtils.equals(JobRunType.SERIAL.name(), jobBranch.getRunType())) {
            Run run = null;
            for (JobBranch child : children) {
                if (StringUtils.equals(BranchTypeEnum.BRANCH_NODE.getType(), child.getType())) {
                    run = new SerialRunStrategy();
                    run.runMethod((AbstractJob) factory.createJob(child),child.getParams(),child.getName());
                } else {
                    recursionProcess(child);
                }
            }
        } else {
            for (final JobBranch child : children) {
                if (StringUtils.equals(BranchTypeEnum.BRANCH_NODE.getType(), child.getType())) {
                    executorService.submit(new Runnable() {
                        public void run() {
                            try {
                                ((AbstractJob) factory.createJob(child)).doBusiness(child.getParams());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else {
                    recursionProcess(child);
                }
            }
        }
    }
}
