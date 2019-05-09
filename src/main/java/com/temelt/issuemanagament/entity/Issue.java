package com.temelt.issuemanagament.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data //for getter and setter
@NoArgsConstructor //boş const. oluşturuyor.
@AllArgsConstructor //tüm fieldlar kulllanılarak oluşturulmuş contst.
@ToString //nesnenin toString metodunu ovverride ediyor.
@EqualsAndHashCode (callSuper = true)
@Entity
@Table(name="issue")
public class Issue extends BaseEntity {
    //BaseEntity'i extend ederek hem Serializable hem de classtan gelen 5 kolon eklenmiş oldu.
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="description", length = 400)
    private String description;

    @Column(name="details", length = 400)
    private String details;

    @Column(name="date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name="issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name="assignee_user_id")
    @ManyToOne(optional=true, fetch = FetchType.LAZY)
    private User assignee;

    @JoinColumn(name="project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;
    //optianol=true : bir issue oluştururken user_id'si null olabilir.
    //fech: issue- user arasında bir join var issue nesnesi oluştururken user tablosuyla join yapıp getirsin mi
    //eager:getirilir - lazy: get medotu çağırılarak ihtiyaç olduğunda getirilir.

}
