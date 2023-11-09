class Batch {
    fun createUser (user:String) {
        ActiveDirectory().createUser(user)
        YourName().createUser(user)
        Ldap().createUser(user)
    }
    fun updateUser (user:String) {
        ActiveDirectory().updateUser(user)
        YourName().updateUser(user)
        Ldap().updateUser(user)
    }
    fun createGroup (group:String) {
        ActiveDirectory().createGroup(group)
        YourName().createGroup(group)
        Ldap().createGroup(group)
    }
    fun updateGroup (group:String) {
        ActiveDirectory().updateGroup(group)
        YourName().updateGroup(group)
        Ldap().updateGroup(group)
    }
}