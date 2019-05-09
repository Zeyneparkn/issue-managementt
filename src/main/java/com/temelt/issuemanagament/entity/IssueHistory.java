package com.temelt.issuemanagament.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="issue_history")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode (callSuper = true)
@Data
public class IssueHistory extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JoinColumn(name = "issue_id")
  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private Issue issue;

  @Column(name = "description", length = 1000)
  private String desscription;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date")
  private Date date;

  @Column(name = "issue_status")
  @Enumerated(EnumType.STRING)
  private IssueStatus issueStatus;

  @Column(name = "details", length = 4000)
  private String details;


  @JoinColumn(name = "assignee_user_id")
  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private User assignee;

}