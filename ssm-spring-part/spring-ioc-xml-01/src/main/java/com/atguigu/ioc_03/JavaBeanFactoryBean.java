package com.atguigu.ioc_03;

import org.springframework.beans.factory.FactoryBean;

public class JavaBeanFactoryBean implements FactoryBean<JavaBean> {

    private String name = null;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public JavaBean getObject() throws Exception {
        JavaBean javaBean = new JavaBean();
        javaBean.setName(name);
        return javaBean;
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }
}
