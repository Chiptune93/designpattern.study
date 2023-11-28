package composite

class SubCategory(val name: String, val parentName: String?): Category() {

    override fun print() {
        println("이건 자식 카테고리입니다. 카테고리 이름은 ${this.name} 이며, 부모 카테고리는 ${this.parentName ?: this.parentName} 입니다.")
    }
}