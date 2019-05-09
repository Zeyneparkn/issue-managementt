package com.temelt.issuemanagament.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode (callSuper = true)
public class User  extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="uname", length = 100, unique = true) //username:uniqe'tir. Aynı isimle birden fazla kullanıcı kayıt olamaz.
    private String username;

    @Column(name="pwd", length = 200)
    private String password;

    @Column(name="name_surname", length = 200)
    private String nameSurname;

    @Column(name="email", length = 100)
    private String email;

    @JoinColumn(name="assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;

}
