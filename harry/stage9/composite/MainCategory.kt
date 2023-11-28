package composite

class MainCategory(val name: String, val parentName: String?, val child:List<Category>) : Category() {
    override fun print() {
        println("카테고리 이름은 ${this.name} 이며, 부모 카테고리는 ${this.parentName ?: this.parentName} 입니다, 자식 카테고리는 ${this.child.size} 개 있습니다.")
    }
}