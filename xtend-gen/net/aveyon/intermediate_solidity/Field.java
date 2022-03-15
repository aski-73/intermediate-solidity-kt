package net.aveyon.intermediate_solidity;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public abstract class Field {
  private final String name;
  
  private final Visibility visibility;
  
  private final String type;
  
  private final boolean payable;
  
  private final String value;
  
  public Field(final String name, final Visibility visibility, final String type, final boolean payable, final String value) {
    super();
    this.name = name;
    this.visibility = visibility;
    this.type = type;
    this.payable = payable;
    this.value = value;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.name== null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.visibility== null) ? 0 : this.visibility.hashCode());
    result = prime * result + ((this.type== null) ? 0 : this.type.hashCode());
    result = prime * result + (this.payable ? 1231 : 1237);
    return prime * result + ((this.value== null) ? 0 : this.value.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Field other = (Field) obj;
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    if (this.visibility == null) {
      if (other.visibility != null)
        return false;
    } else if (!this.visibility.equals(other.visibility))
      return false;
    if (this.type == null) {
      if (other.type != null)
        return false;
    } else if (!this.type.equals(other.type))
      return false;
    if (other.payable != this.payable)
      return false;
    if (this.value == null) {
      if (other.value != null)
        return false;
    } else if (!this.value.equals(other.value))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("name", this.name);
    b.add("visibility", this.visibility);
    b.add("type", this.type);
    b.add("payable", this.payable);
    b.add("value", this.value);
    return b.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  @Pure
  public Visibility getVisibility() {
    return this.visibility;
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  @Pure
  public boolean isPayable() {
    return this.payable;
  }
  
  @Pure
  public String getValue() {
    return this.value;
  }
}
