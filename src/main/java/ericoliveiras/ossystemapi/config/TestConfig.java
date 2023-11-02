package ericoliveiras.ossystemapi.config;

import ericoliveiras.ossystemapi.domain.serviceOrder.entity.ServiceOrder;
import ericoliveiras.ossystemapi.domain.serviceOrder.repository.ServiceOrderRepository;
import ericoliveiras.ossystemapi.domain.user.entity.User;
import ericoliveiras.ossystemapi.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private ServiceOrderRepository serviceOrderRepository;

  @Override
  public void run(String... args) throws Exception {
    User u1 = new User(
      null,
      "eriicdiiego",
      "Eric Oliveira",
      "123456",
      LocalDateTime.now(),
      LocalDateTime.now()
    );

    User u2 = new User(
      null,
      "hudsondiego",
      "Hudson Oliveira",
      "123456",
      LocalDateTime.now(),
      LocalDateTime.now()
    );

    userRepository.saveAll(List.of(u1, u2));

    ServiceOrder so1 = new ServiceOrder(
      null,
      "Loja A",
      "Problema elétrico",
      null,
      null,
      false,
      LocalDateTime.now(),
      LocalDateTime.now(),
      u1
    );

    serviceOrderRepository.saveAll(List.of(so1));
  }
}
