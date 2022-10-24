package com.team.upbank.eunjin.service;

import com.team.upbank.eunjin.domain.Account;
import com.team.upbank.eunjin.domain.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional(readOnly = true)
    public List<Account> getAccountList(){
        return accountRepository.findAll(Sort.by(Sort.Direction.DESC,"newDate"));
    }

}
