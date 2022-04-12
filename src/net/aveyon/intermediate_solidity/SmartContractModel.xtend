package net.aveyon.intermediate_solidity

import java.util.List
import java.util.LinkedList
import lombok.Getter
import lombok.Setter

@Getter
@Setter
abstract class SmartContractModel {
	String pragma
	List<SmartContract> smartContracts = new LinkedList()
}
