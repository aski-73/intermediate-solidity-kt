package net.aveyon.intermediate_solidity;

import java.util.List;
import java.util.function.Consumer;
import lombok.Getter;
import lombok.Setter;
import net.aveyon.intermediate_solidity.impl.StructureFieldImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@Getter
@Setter
@SuppressWarnings("all")
public abstract class Structure extends Node {
  private String name;
  
  private List<StructureField> fields = CollectionLiterals.<StructureField>newLinkedList();
  
  public Structure(final Structure copySource) {
    this.name = copySource.name;
    final Consumer<StructureField> _function = (StructureField f) -> {
      StructureFieldImpl _structureFieldImpl = new StructureFieldImpl(f);
      this.fields.add(_structureFieldImpl);
    };
    copySource.fields.forEach(_function);
  }
}
