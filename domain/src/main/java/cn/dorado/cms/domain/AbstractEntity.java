package cn.dorado.cms.domain;

import java.io.Serializable;

/**
 * Created by Eric on 14-4-29.
 */
public abstract class AbstractEntity implements Serializable {
    /**
     * 返回类信息的toString()方法.
     *
     * @return 包含类信息的字符串.
     */
    public abstract String toString();

    /**
     * Hibernate进行对象比较时用到的方法，实体对象的主键应该包含在内.
     *
     * @param o 要比较的对象
     * @return true/false 依据比较结果而定.
     */
    public abstract boolean equals(Object o);

    /**
     * 同样是Hibernate的要求，实现equals()方法后，必须要实现hasCode()方法.
     * http://www.hibernate.org/109.html
     *
     * @return hashCode
     */
    public abstract int hashCode();
}
