package ericoliveiras.ossystemapi.domain.user.service;

import ericoliveiras.ossystemapi.domain.user.entity.User;
import ericoliveiras.ossystemapi.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User find(UUID id) {
    Optional<User> user = repository.findById(id);

    return user.orElse(null);
  }
}