class Factory {
    sealed class Function {
        object Default
    }

    companion object {
        val f = Function
        val x = Function.<!UNRESOLVED_REFERENCE!>Default<!>
    }
}