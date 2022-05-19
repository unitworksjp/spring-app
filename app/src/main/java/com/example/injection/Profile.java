package com.example.injection;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class Profile {
  private String firstName = "テスト";
  private String LastName = "太郎";
  private String country = "JPN";
  private String birthday = "20000101";
  private int gender = 1;
}
