package net.aveyon.intermediate_solidity

import java.util.List
import lombok.Getter
import lombok.Setter

@Getter
@Setter
abstract class SmartContract {
	String name
	boolean iface
	List<SmartContract> extending = newLinkedList
	List<Field> fields = newLinkedList
	List<Operation> operations = newLinkedList	
}
