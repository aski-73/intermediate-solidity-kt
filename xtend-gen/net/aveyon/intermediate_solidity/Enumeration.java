package net.aveyon.intermediate_solidity;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@Getter
@Setter
@SuppressWarnings("all")
public abstract class Enumeration {
  private String name;
  
  private List<String> values = CollectionLiterals.<String>newLinkedList();
}
