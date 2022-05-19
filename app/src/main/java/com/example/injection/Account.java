package com.example.injection;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class Account {
  private int account_id = 1;
  private String email = "testuser@example.com";
  private String password = "password";
  private String passwordConfirm = "password";
  private String name = "tester";
}
