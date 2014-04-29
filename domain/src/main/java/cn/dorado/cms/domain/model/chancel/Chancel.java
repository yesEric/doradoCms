package cn.dorado.cms.domain.model.chancel;

import cn.dorado.cms.domain.DomainId;
import cn.dorado.cms.domain.model.chancel.column.Column;
import cn.dorado.cms.domain.model.common.Owner;
import cn.dorado.cms.domain.model.common.SmartDate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eric on 14-4-29.
 */
public class Chancel {
    DomainId chancelId;
    String title;
    Set<Column> columnSet=new HashSet<Column>();
    int chancelState;
    int approvalState;
    Owner owner;
    SmartDate createDate;

    public DomainId getChancelId() {
        return chancelId;
    }

    public void setChancelId(DomainId chancelId) {
        this.chancelId = chancelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Column> getColumnSet() {
        return columnSet;
    }

    public void setColumnSet(Set<Column> columnSet) {
        this.columnSet = columnSet;
    }

    public int getChancelState() {
        return chancelState;
    }

    public void setChancelState(int chancelState) {
        this.chancelState = chancelState;
    }

    public int getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(int approvalState) {
        this.approvalState = approvalState;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public SmartDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(SmartDate createDate) {
        this.createDate = createDate;
    }
}
