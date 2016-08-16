package com.iyihua.sample.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iyihua.sample.domain.order.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
