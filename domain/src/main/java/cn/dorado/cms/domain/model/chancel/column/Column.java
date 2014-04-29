package cn.dorado.cms.domain.model.chancel.column;

import cn.dorado.cms.domain.AbstractEntity;
import cn.dorado.cms.domain.DomainId;
import cn.dorado.cms.domain.model.common.Owner;
import cn.dorado.cms.domain.model.common.SmartDate;

/**
 * Created by Eric on 14-4-29.
 */
public class Column extends AbstractEntity {
    DomainId columnId;
    String title;
    Owner owner;
    int publishState;
    int approvalState;
    SmartDate createDate;

    public SmartDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(SmartDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Column{" +
                "columnId=" + columnId +
                ", title='" + title + '\'' +
                ", owner=" + owner +
                ", publishState=" + publishState +
                ", approvalState=" + approvalState +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Column column = (Column) o;

        if (!columnId.equals(column.columnId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return columnId.hashCode();
    }

    public DomainId getColumnId() {
        return columnId;
    }

    public void setColumnId(DomainId columnId) {
        this.columnId = columnId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPublishState() {
        return publishState;
    }

    public void setPublishState(int publishState) {
        this.publishState = publishState;
    }

    public int getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(int approvalState) {
        this.approvalState = approvalState;
    }
}
