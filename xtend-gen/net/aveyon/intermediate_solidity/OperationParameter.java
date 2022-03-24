package net.aveyon.intermediate_solidity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@SuppressWarnings("all")
public abstract class OperationParameter {
  private String name;
  
  private String type;
  
  private MemoryType memoryType = MemoryType.MEMORY;
}
