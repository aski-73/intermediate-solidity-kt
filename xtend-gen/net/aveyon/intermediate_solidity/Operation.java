package net.aveyon.intermediate_solidity;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@Getter
@Setter
@SuppressWarnings("all")
public abstract class Operation {
  private String name;
  
  private Visibility visibility;
  
  private List<String> expressions = CollectionLiterals.<String>newLinkedList();
  
  private List<String> returns = CollectionLiterals.<String>newLinkedList();
}
