package com.team.upbank.injune.service;

import com.team.upbank.injune.domain.AccountTransfer;
import com.team.upbank.injune.domain.AccountTransferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountTransferService {
    private final AccountTransferRepository accountTransferRepository;


    @Transactional(readOnly = true)
    public List<AccountTransfer> getTransferList() {
        return accountTransferRepository.findAll(Sort.by(Sort.Direction.DESC, "tfDate"));
    }
//
//    @Transactional(readOnly = true)
//    public Page<AccountTransfer> getTransferPage(SearchAccountTransfer search, Pageable page){
//        return accountTransferRepository.
//    }

    @Transactional(readOnly = true)
    public AccountTransfer getTransfer(Long tfNum) {
        return accountTransferRepository.findById(tfNum).orElse(null);
    }

}
