package com.echo.jpa.domain;

import com.echo.data.domain.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Galen on 2015/11/5.
 */
@DynamicInsert
@DynamicUpdate
@MappedSuperclass
public abstract class BaseJpaEntity<ID> extends Auditable<ID> {

    private ID id;

    private String createdBy;

    private Date creationTime;

    private String lastModifiedBy;

    private Date lastModificationTime;


    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public ID getId() {
        return id;
    }

    @Override
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    @Column(name = "creation_time")
    public Date getCreationTime() {
        return creationTime;
    }

    @Override
    @Column(name = "last_modified_by")
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @Override
    @Column(name = "last_modification_time")
    public Date getLastModificationTime() {
        return lastModificationTime;
    }

    @Override
    public void setId(final ID id) {
        this.id = id;
    }

    @Override
    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public void setCreationTime(final Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public void setLastModificationTime(final Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
