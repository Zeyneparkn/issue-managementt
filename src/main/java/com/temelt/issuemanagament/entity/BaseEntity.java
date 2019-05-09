package com.temelt.issuemanagament.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data //bu annotation getter ve setter'ı yazmadan otomatşik oluşt.
@MappedSuperclass //Buradaki property'ler diğer tüm tablolarımda olacak
public  abstract class BaseEntity implements Serializable {

    //String alanda length girmen lazınm yoksa default 255 karakrter ayırır.
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by",length = 50)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "updated_by",length = 50)
    private String updatedBy;

    @Column(name = "status")
    private Boolean status;


}
