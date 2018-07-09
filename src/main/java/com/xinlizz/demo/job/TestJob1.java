package com.xinlizz.demo.job;

/**
 * 测试job类一
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class TestJob1 extends AbstractJob {

    private String jobName;

    public TestJob1() {
        this.jobName = "TestJob1";
    }

    public Object doBusiness(Object[] params) {
        System.out.println("Job is " + this.jobName);
        return jobName;
    }
}
