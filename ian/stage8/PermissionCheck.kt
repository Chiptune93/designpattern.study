data class Person(
    val name: String,
    val permissionLevel:Int
)

abstract class PermissionCheck {
    protected abstract fun nameValidation(string: String)

    protected abstract fun permissionValidation(string: String)

    fun check(str: String){
        nameValidation(str)
        permissionValidation(str)
    }
}