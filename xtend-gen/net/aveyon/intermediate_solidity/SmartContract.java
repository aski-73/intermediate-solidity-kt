package net.aveyon.intermediate_solidity;

import java.util.List;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class SmartContract {
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private String name;
  
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private boolean iface;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<SmartContract> extending = CollectionLiterals.<SmartContract>newLinkedList();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<Field> fields = CollectionLiterals.<Field>newLinkedList();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<Operation> operations = CollectionLiterals.<Operation>newLinkedList();
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public boolean isIface() {
    return this.iface;
  }
  
  public void setIface(final boolean iface) {
    this.iface = iface;
  }
  
  @Pure
  public List<SmartContract> getExtending() {
    return this.extending;
  }
  
  @Pure
  public List<Field> getFields() {
    return this.fields;
  }
  
  @Pure
  public List<Operation> getOperations() {
    return this.operations;
  }
}
