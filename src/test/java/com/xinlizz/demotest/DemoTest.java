package com.xinlizz.demotest;

import com.alibaba.fastjson.JSONArray;
import com.xinlizz.demo.enums.BranchTypeEnum;
import com.xinlizz.demo.enums.JobRunType;
import com.xinlizz.demo.service.IJobService;
import com.xinlizz.demo.service.impl.JobServiceImpl;
import com.xinlizz.demo.treeviews.JobBranch;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class DemoTest {

    @Test
    public void process() throws Exception {
        System.out.println(JSONArray.toJSONString(initRoot()));
        JobBranch root = initRoot();
        IJobService jobService = new JobServiceImpl();
        jobService.processJobTree(root);
    }

    private JobBranch initRoot() {
        JobBranch root = new JobBranch();
        root.setName("root");
        root.setType(BranchTypeEnum.BRANCH_ROOT.getType());
        root.setRunType(JobRunType.SERIAL.name());
        root.setChildren(new ArrayList<JobBranch>());

        JobBranch node = null;
        List<JobBranch> children = new ArrayList<JobBranch>();
        for (int j = 0; j < 5; j++) {
            node = new JobBranch((long) (j+1), "com.xinlizz.demo.job.TestJob" + (j+1), null, BranchTypeEnum.BRANCH_NODE.getType(), null, JobRunType.SERIAL.name());
            children.add(node);
        }
        node = new JobBranch(1L, null, null, BranchTypeEnum.BRANCH_BRANCH.getType(), children, JobRunType.SERIAL.name());
        root.getChildren().add(node);

        children = new ArrayList<JobBranch>();
        for (int j = 0; j < 5; j++) {
            node = new JobBranch((long) (j+1), "com.xinlizz.demo.job.TestJob" + (j+1), null, BranchTypeEnum.BRANCH_NODE.getType(), null, JobRunType.PARALLEL.name());
            children.add(node);
        }
        node = new JobBranch(2L, null, null, BranchTypeEnum.BRANCH_BRANCH.getType(), children, JobRunType.SERIAL.name());
        root.getChildren().add(node);

        return root;
    }
}
