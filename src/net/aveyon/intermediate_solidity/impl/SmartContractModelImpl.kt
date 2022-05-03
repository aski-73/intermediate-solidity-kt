package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.SmartContractModel

class SmartContractModelImpl(license: String, pragma: String) : SmartContractModel(SolidityConceptsImpl(), pragma, license)
