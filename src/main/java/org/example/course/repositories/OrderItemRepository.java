package org.example.course.repositories;

import org.example.course.entities.OrderItem;
import org.example.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
