package com.team.upbank.injune.domain;

import antlr.StringUtils;
import com.querydsl.core.BooleanBuilder;
import com.team.upbank.injune.dto.SearchAccountTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface AccountTransferRepository extends JpaRepository<AccountTransfer, Long>, QuerydslPredicateExecutor<AccountTransfer> {
//    static BooleanBuilder search(SearchAccountTransfer search){
//        BooleanBuilder booleanBuilder = new BooleanBuilder();
//        QAccountTransfer qAccountTransfer = QAccountTransfer.accountTransfer;
//
//        if(!StringUtils.isNullOrEmpty(search.getSearchAccount())){
//            booleanBuilder.and(qAccountTransfer)
//        }
//
//    }
}
