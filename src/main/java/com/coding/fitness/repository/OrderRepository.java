package com.coding.fitness.repository;

import com.coding.fitness.entity.Order;
import com.coding.fitness.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserIdAndOrderStatusIn(Long userId, List<OrderStatus> orderStatus);
    List<Order> findAllByOrderStatusIn(List<OrderStatus> orderStatuses);

    Order findByUserIdAndCouponNotNull(Long userId);
}
