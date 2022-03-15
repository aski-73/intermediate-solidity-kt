package net.aveyon.intermediate_solidity;

import java.util.List;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class Structure {
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private String name;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<Field> fields = CollectionLiterals.<Field>newLinkedList();
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public List<Field> getFields() {
    return this.fields;
  }
}
