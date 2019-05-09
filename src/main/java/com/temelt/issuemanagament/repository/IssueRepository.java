package com.temelt.issuemanagament.repository;

import com.temelt.issuemanagament.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue,Long> {
    //Db'ye bu katmandan bağlanacaz.Interfacelerini oluşturduk. JPA repository'den extend ettik. JPA reposiyory bu interface'in hangi entity classı üserinden işlem yapacağını ve o entity'nin id tipin, istiyor.
    //JPArep. içinde findAll saveAll gibi metodlar var.
    //JPA rep. ise PagingAndSortingRepository rep.'den extend edilmiştir.


}
