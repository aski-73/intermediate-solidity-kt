package net.aveyon.intermediate_solidity;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@Getter
@Setter
@SuppressWarnings("all")
public abstract class SmartContract {
  private String name;
  
  private boolean iface;
  
  private List<SmartContract> extending = CollectionLiterals.<SmartContract>newLinkedList();
  
  private List<Field> fields = CollectionLiterals.<Field>newLinkedList();
  
  private List<Operation> operations = CollectionLiterals.<Operation>newLinkedList();
}
