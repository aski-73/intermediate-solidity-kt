package net.aveyon.intermediate_solidity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@SuppressWarnings("all")
public abstract class OperationParameter extends Node {
  private String name;
  
  private String type;
  
  private DataLocation dataLocation = DataLocation.MEMORY;
  
  public OperationParameter(final OperationParameter copySource) {
    this.name = copySource.name;
    this.type = copySource.type;
    this.dataLocation = copySource.dataLocation;
  }
}
