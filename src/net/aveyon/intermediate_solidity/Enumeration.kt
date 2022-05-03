package net.aveyon.intermediate_solidity

import lombok.Getter
import lombok.Setter
import java.util.LinkedList

@Getter
@Setter
abstract class Enumeration(name: String) : Node(name) {
    val values: MutableList<String> = LinkedList()
}
