package net.aveyon.intermediate_solidity;

import java.util.List;
import java.util.function.Consumer;
import lombok.Getter;
import lombok.Setter;
import net.aveyon.intermediate_solidity.impl.FieldImpl;
import net.aveyon.intermediate_solidity.impl.OperationImpl;
import net.aveyon.intermediate_solidity.impl.SmartContractImpl;
import net.aveyon.intermediate_solidity.impl.StructureImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@Getter
@Setter
@SuppressWarnings("all")
public abstract class SmartContract extends Node {
  private String name;
  
  private boolean isInterface;
  
  private boolean isAbstract = false;
  
  private List<SmartContract> extending = CollectionLiterals.<SmartContract>newLinkedList();
  
  private List<Field> fields = CollectionLiterals.<Field>newLinkedList();
  
  private List<Operation> operations = CollectionLiterals.<Operation>newLinkedList();
  
  private List<Structure> structures = CollectionLiterals.<Structure>newLinkedList();
  
  public SmartContract(final SmartContract copySource) {
    this.name = copySource.name;
    this.isInterface = copySource.isInterface;
    final Consumer<SmartContract> _function = (SmartContract ext) -> {
      SmartContractImpl _smartContractImpl = new SmartContractImpl(ext);
      this.extending.add(_smartContractImpl);
    };
    copySource.extending.forEach(_function);
    final Consumer<Field> _function_1 = (Field f) -> {
      FieldImpl _fieldImpl = new FieldImpl(f);
      this.fields.add(_fieldImpl);
    };
    copySource.fields.forEach(_function_1);
    final Consumer<Operation> _function_2 = (Operation op) -> {
      OperationImpl _operationImpl = new OperationImpl(op);
      this.operations.add(_operationImpl);
    };
    copySource.operations.forEach(_function_2);
    final Consumer<Structure> _function_3 = (Structure struct) -> {
      StructureImpl _structureImpl = new StructureImpl(struct);
      this.structures.add(_structureImpl);
    };
    copySource.structures.forEach(_function_3);
  }
}
