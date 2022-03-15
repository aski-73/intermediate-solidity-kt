package net.aveyon.intermediate_solidity

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.LinkedList

abstract class SmartContractModel {
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	String pragma
	@Accessors(PUBLIC_GETTER)
	List<SmartContract> smartContracts = new LinkedList()
}
