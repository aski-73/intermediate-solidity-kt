package net.aveyon.intermediate_solidity;

import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class OperationParameter {
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private String name;
  
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private String type;
  
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private MemoryType memoryType = MemoryType.MEMORY;
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  public void setType(final String type) {
    this.type = type;
  }
  
  @Pure
  public MemoryType getMemoryType() {
    return this.memoryType;
  }
  
  public void setMemoryType(final MemoryType memoryType) {
    this.memoryType = memoryType;
  }
}
