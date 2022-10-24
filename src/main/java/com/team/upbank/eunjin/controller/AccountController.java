package com.team.upbank.eunjin.controller;

import com.team.upbank.eunjin.domain.Account;
import com.team.upbank.eunjin.service.AccountService;
import com.team.upbank.injune.domain.AccountTransfer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/accountList")
    public List<Account> getAccountList(){
        return accountService.getAccountList();
    }
}
