package cn.dorado.cms.domain;

/**
 * Created by Eric on 14-4-29.
 * 此值对象用于保存实体的ID
 */
public class DomainId {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DomainId{" +
                "id='" + id + '\'' +
                '}';
    }
}
