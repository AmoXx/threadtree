package com.xinlizz.demo.job;

/**
 * 测试job类一
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class TestJob5 extends AbstractJob {

    private String jobName;

    public TestJob5() {
        this.jobName = "TestJob5";
    }

    public Object doBusiness(Object[] params) {
        System.out.println("Job is " + this.jobName);
        return jobName;
    }
}
