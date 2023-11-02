package ericoliveiras.ossystemapi.domain.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ericoliveiras.ossystemapi.domain.serviceOrder.entity.ServiceOrder;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String username;
  private String fullName;
  private String password;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  @JsonIgnore
  @OneToMany(mappedBy = "user")
  private List<ServiceOrder> serviceOrders = new ArrayList<>();

  public User() {
  }

  public User(
    UUID id,
    String username,
    String fullName,
    String password,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
  ) {
    this.id = id;
    this.username = username;
    this.fullName = fullName;
    this.password = password;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public List<ServiceOrder> getServiceOrders() {
    return serviceOrders;
  }
}
