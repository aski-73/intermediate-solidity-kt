package net.aveyon.intermediate_solidity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@SuppressWarnings("all")
public class Import {
  private String path;
  
  private SmartContract smartContract;
}
