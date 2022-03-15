package net.aveyon.intermediate_solidity;

import java.util.LinkedList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class SmartContractModel {
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private String pragma;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<SmartContract> smartContracts = new LinkedList<SmartContract>();
  
  @Pure
  public String getPragma() {
    return this.pragma;
  }
  
  public void setPragma(final String pragma) {
    this.pragma = pragma;
  }
  
  @Pure
  public List<SmartContract> getSmartContracts() {
    return this.smartContracts;
  }
}
