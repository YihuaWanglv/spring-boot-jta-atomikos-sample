package com.iyihua.sample.domain.order;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "red_packet_account")
public class RedPacketAccount {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@Column(name = "user_id", nullable = false)
    private long userId;
	@Column(name = "balance_amount", nullable = false)
    private BigDecimal balanceAmount;

    public long getUserId() {
        return userId;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }


    public long getId() {
		return id;
	}
    public void setId(long id) {
		this.id = id;
	}
    public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
    public void setUserId(long userId) {
		this.userId = userId;
	}

    public void transferFrom(BigDecimal amount) {
        this.balanceAmount = this.balanceAmount.subtract(amount);

        if (BigDecimal.ZERO.compareTo(this.balanceAmount) > 0) {
            throw new RuntimeException("not enough balance!");
        }
    }

    public void transferTo(BigDecimal amount) {
        this.balanceAmount = this.balanceAmount.add(amount);
    }

    public void cancelTransfer(BigDecimal amount) {
        transferTo(amount);
    }
}
