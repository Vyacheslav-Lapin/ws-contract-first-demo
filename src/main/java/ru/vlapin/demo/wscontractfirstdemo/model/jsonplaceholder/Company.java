package ru.vlapin.demo.wscontractfirstdemo.model.jsonplaceholder;

import static lombok.AccessLevel.PRIVATE;

import lombok.Data;
import lombok.Setter;

@Data
@Setter(PRIVATE)
public class Company {

  String name;
  String catchPhrase;
  String bs;
}
