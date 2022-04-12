package net.aveyon.intermediate_solidity;

import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("all")
public abstract class SmartContractModel {
  private String pragma;
  
  private List<SmartContract> smartContracts = new LinkedList<SmartContract>();
}
