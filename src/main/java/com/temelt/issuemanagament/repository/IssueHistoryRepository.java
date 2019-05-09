package com.temelt.issuemanagament.repository;

import com.temelt.issuemanagament.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {

}
