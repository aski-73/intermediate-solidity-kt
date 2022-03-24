package net.aveyon.intermediate_solidity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@SuppressWarnings("all")
public abstract class Field {
  private String name;
  
  private Visibility visibility;
  
  private String type;
  
  private boolean payable;
  
  private String value;
}
