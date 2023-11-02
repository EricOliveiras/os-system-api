package ericoliveiras.ossystemapi.domain.serviceOrder.repository;

import ericoliveiras.ossystemapi.domain.serviceOrder.entity.ServiceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> {
}
