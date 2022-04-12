package net.aveyon.intermediate_solidity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@SuppressWarnings("all")
public abstract class Field extends StructureField {
  private Visibility visibility;
  
  private String value;
  
  public Field(final Field copySource) {
    super(copySource);
    this.visibility = copySource.visibility;
    this.value = copySource.value;
  }
}
