/*
 *  Copyright (c) 2022-2023, Mybatis-Flex (fuhai999@gmail.com).
 *  <p>
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  <p>
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.mybatisflex.codegen.config;

import java.io.Serializable;

/**
 * 生成 Entity 的配置。
 *
 * @author 王帅
 * @since 2023-05-15
 */
@SuppressWarnings("unused")
public class EntityConfig {

    /**
     * Entity 类的前缀。
     */
    private String classPrefix = "";

    /**
     * Entity 类的后缀。
     */
    private String classSuffix = "";

    /**
     * Entity 类的父类，可以自定义一些 BaseEntity 类。
     */
    private Class<?> supperClass;

    /**
     * 是否覆盖之前生成的文件。
     */
    private boolean overwriteEnable;

    /**
     * Entity 默认实现的接口。
     */
    private Class<?>[] implInterfaces = {Serializable.class};

    /**
     * Entity 是否使用 Lombok 注解。
     */
    private boolean withLombok;

    /**
     * 获取类前缀。
     */
    public String getClassPrefix() {
        return classPrefix;
    }

    /**
     * 设置类前缀。
     */
    public EntityConfig setClassPrefix(String classPrefix) {
        this.classPrefix = classPrefix;
        return this;
    }

    /**
     * 获取类后缀。
     */
    public String getClassSuffix() {
        return classSuffix;
    }

    /**
     * 设置类后缀。
     */
    public EntityConfig setClassSuffix(String classSuffix) {
        this.classSuffix = classSuffix;
        return this;
    }

    /**
     * 获取父类。
     */
    public Class<?> getSupperClass() {
        return supperClass;
    }

    /**
     * 设置父类。
     */
    public EntityConfig setSupperClass(Class<?> supperClass) {
        this.supperClass = supperClass;
        return this;
    }

    /**
     * 是否覆盖原有文件。
     */
    public boolean isOverwriteEnable() {
        return overwriteEnable;
    }

    /**
     * 设置是否覆盖原有文件。
     */
    public EntityConfig setOverwriteEnable(boolean overwriteEnable) {
        this.overwriteEnable = overwriteEnable;
        return this;
    }

    /**
     * 获取实现接口。
     */
    public Class<?>[] getImplInterfaces() {
        return implInterfaces;
    }

    /**
     * 设置实现接口。
     */
    public EntityConfig setImplInterfaces(Class<?>... implInterfaces) {
        this.implInterfaces = implInterfaces;
        return this;
    }

    /**
     * 是否使用 Lombok。
     */
    public boolean isWithLombok() {
        return withLombok;
    }

    /**
     * 设置是否使用 Lombok。
     */
    public EntityConfig setWithLombok(boolean withLombok) {
        this.withLombok = withLombok;
        return this;
    }

}