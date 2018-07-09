package com.xinlizz.demo.job;

/**
 * 测试job类一
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class TestJob3 extends AbstractJob {

    private String jobName;

    public TestJob3() {
        this.jobName = "TestJob3";
    }

    public Object doBusiness(Object[] params) {
        System.out.println("Job is " + this.jobName);
        return jobName;
    }
}
