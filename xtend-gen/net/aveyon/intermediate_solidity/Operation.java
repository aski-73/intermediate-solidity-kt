package net.aveyon.intermediate_solidity;

import java.util.List;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class Operation {
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private String name;
  
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private Visibility visibility;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<String> expressions = CollectionLiterals.<String>newLinkedList();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<String> returnss = CollectionLiterals.<String>newLinkedList();
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public Visibility getVisibility() {
    return this.visibility;
  }
  
  public void setVisibility(final Visibility visibility) {
    this.visibility = visibility;
  }
  
  @Pure
  public List<String> getExpressions() {
    return this.expressions;
  }
  
  @Pure
  public List<String> getReturnss() {
    return this.returnss;
  }
}
