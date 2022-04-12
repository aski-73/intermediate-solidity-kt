package net.aveyon.intermediate_solidity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@SuppressWarnings("all")
public abstract class StructureField extends Node {
  protected String type;
  
  protected boolean payable;
  
  protected boolean array;
  
  public StructureField(final StructureField copySource) {
    this.type = copySource.type;
    this.payable = copySource.payable;
    this.array = copySource.array;
  }
}
