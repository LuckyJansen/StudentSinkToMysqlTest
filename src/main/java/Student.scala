
class Student(var id: Int, var name: String) {
  override def toString: String = "Student{" + "id=" + id + ", name='" + name + '\'' + '}'

  def getId: Int = id

  def setId(id: Int): Unit = {
    this.id = id
  }

  def getName: String = name

  def setName(name: String): Unit = {
    this.name = name
  }
}