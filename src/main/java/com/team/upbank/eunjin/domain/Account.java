package com.team.upbank.eunjin.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="account_tbl")
public class Account {
    @ApiModelProperty("계좌")
    @Id
    private String account;

    @ApiModelProperty("계좌 이름")
    @Column
    private String accountName;

    @ApiModelProperty("상품 이름")
    @Column
    private String productName;

    @ApiModelProperty("아이디")
    @Column
    private String id;

    @ApiModelProperty("비밀번호")
    @Column
    private String accountPw;

    @ApiModelProperty("금액")
    @Column
    private Long balance;

    @ApiModelProperty("계좌 종류")
    @Column
    private String accountType;

    @ApiModelProperty("계좌 상태")
    @Column
    private String accountState;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private String accStateContent;

    @ApiModelProperty("계좌 제한 날")
    @Column
    private Long accLimitDay;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private Long accLimitTrsf;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private Timestamp deleteDate;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private Timestamp sleepDate;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private Timestamp newDate;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private Timestamp LastDate;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private String transferable;

    @ApiModelProperty("계좌 상태 내용")
    @Column
    private String phone;







}
