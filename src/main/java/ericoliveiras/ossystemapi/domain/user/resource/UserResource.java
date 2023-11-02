package ericoliveiras.ossystemapi.domain.user.resource;

import ericoliveiras.ossystemapi.domain.user.entity.User;
import ericoliveiras.ossystemapi.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserResource {
  @Autowired
  private UserService service;

  @GetMapping
  public ResponseEntity<List<User>> findALl() {
    List<User> users = service.findAll();
    return ResponseEntity.ok().body(users);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> find(@PathVariable UUID id) {
    User user = service.find(id);
    return ResponseEntity.ok().body(user);
  }
}
