package com.xinlizz.demo.job;

/**
 * 抽象job
 */
public abstract class AbstractJob {

    /**业务参数*/
    private Object[] params;

    /**
     * 业务实现方法
     * @author xinlizz
     * @Date 2018/7/9
     * @Param [params]
     * @return java.lang.Object
     */
    public abstract Object doBusiness(Object[] params);

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
