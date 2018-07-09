package com.xinlizz.demo.job;

/**
 * 测试job类一
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class TestJob4 extends AbstractJob {

    private String jobName;

    public TestJob4() {
        this.jobName = "TestJob4";
    }

    public Object doBusiness(Object[] params) {
        System.out.println("Job is " + this.jobName);
        return jobName;
    }
}
