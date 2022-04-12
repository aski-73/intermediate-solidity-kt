package net.aveyon.intermediate_solidity;

import java.util.List;
import java.util.function.Consumer;
import lombok.Getter;
import lombok.Setter;
import net.aveyon.intermediate_solidity.impl.OperationParameterImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@Getter
@Setter
@SuppressWarnings("all")
public abstract class Operation extends Node {
  private String name;
  
  private boolean isAbstract = false;
  
  private Visibility visibility;
  
  private List<String> expressions = CollectionLiterals.<String>newLinkedList();
  
  private List<String> returns = CollectionLiterals.<String>newLinkedList();
  
  private List<OperationParameter> parameters = CollectionLiterals.<OperationParameter>newLinkedList();
  
  public Operation(final Operation copySource) {
    this.name = copySource.name;
    this.isAbstract = copySource.isAbstract;
    this.visibility = copySource.visibility;
    final Consumer<String> _function = (String exp) -> {
      this.expressions.add(exp);
    };
    copySource.expressions.forEach(_function);
    final Consumer<String> _function_1 = (String ret) -> {
      this.returns.add(ret);
    };
    copySource.returns.forEach(_function_1);
    final Consumer<OperationParameter> _function_2 = (OperationParameter p) -> {
      OperationParameterImpl _operationParameterImpl = new OperationParameterImpl(p);
      this.parameters.add(_operationParameterImpl);
    };
    copySource.parameters.forEach(_function_2);
  }
}
