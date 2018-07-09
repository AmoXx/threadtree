package com.xinlizz.demo.run;

import com.xinlizz.demo.job.AbstractJob;

/**
 * 运行类
 *
 * @author xinlizz
 */
public interface Run {

    /**
     * 运行方法
     *
     * @return void
     */
    void runMethod(AbstractJob job, Object[] params, String jobName);
}
