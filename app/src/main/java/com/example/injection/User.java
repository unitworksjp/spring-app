package com.example.injection;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@AllArgsConstructor
@Data
public class User {
  private Account account;
  private Profile profile;
}
