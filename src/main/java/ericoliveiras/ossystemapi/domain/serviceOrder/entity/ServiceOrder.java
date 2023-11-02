package ericoliveiras.ossystemapi.domain.serviceOrder.entity;

import ericoliveiras.ossystemapi.domain.user.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_service_order")
public class ServiceOrder {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String requester;
  private String problemDescription;
  private String executionDescription;
  private String imageUrl;
  private Boolean finished;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public ServiceOrder() {
  }

  public ServiceOrder(
    Long id,
    String requester,
    String problemDescription,
    String executionDescription,
    String imageUrl,
    Boolean finished,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    User user
  ) {
    this.id = id;
    this.requester = requester;
    this.problemDescription = problemDescription;
    this.executionDescription = executionDescription;
    this.imageUrl = imageUrl;
    this.finished = finished;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.user = user;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRequester() {
    return requester;
  }

  public void setRequester(String requester) {
    this.requester = requester;
  }

  public String getProblemDescription() {
    return problemDescription;
  }

  public void setProblemDescription(String problemDescription) {
    this.problemDescription = problemDescription;
  }

  public String getExecutionDescription() {
    return executionDescription;
  }

  public void setExecutionDescription(String executionDescription) {
    this.executionDescription = executionDescription;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
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

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
