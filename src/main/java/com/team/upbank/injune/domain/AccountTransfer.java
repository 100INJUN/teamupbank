package com.team.upbank.injune.domain;

import com.team.upbank.eunjin.domain.Account;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "account_transfer")
public class AccountTransfer {

    @ApiModelProperty("계좌 이체내역 아이디")
    @Id
    private Long tfNum;

    @ApiModelProperty("계좌 이체내역 계좌")
//    @ManyToOne(targetEntity = Account.class, fetch = FetchType.LAZY)
//    @JoinColumn(name="account", insertable = false, updatable = false)
    @Column
    private String account;

    @ApiModelProperty("계좌 이체내역 보낸사람계좌")
    @Column
    private String tfSenderAcc;

    @ApiModelProperty("계좌 이체내역 은행이름")
    @Column
    private String tfBank;

    @ApiModelProperty("계좌 이체내역 보낸금액")
    @Column
    private Long tfAmount;

    @ApiModelProperty("계좌 이체내역 날짜")
    @Column
    private LocalDateTime tfDate;

    @ApiModelProperty("계좌 이체내역 보낸사람 설명")
    @Column
    private String tfSenderComment;

    @ApiModelProperty("계좌 이체내역 보낸사람 설명")
    @Column
    private String tfDepositComment;

    @ApiModelProperty("계좌 이체내역 예금주")
    @Column
    private String tfAccHolder;

    @ApiModelProperty("계좌 이체내역 수수료")
    @Column
    private Long tfCharges;


}
