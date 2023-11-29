class IteratorUser(var userList: List<Person>): User {

    private var nextIndex = 0

    override fun hasNext(): Boolean {
        return nextIndex < userList.size
    }

    override fun next(): Any {
        return userList[nextIndex++]
    }

}

