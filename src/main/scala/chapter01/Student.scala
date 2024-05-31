package chapter01

class Student(name: String, age: Int) {
  def printinfo(): Unit = {
    println(name + "  " + age + "  " + Student.school)
  }
}

// 引入伴生对象
object Student {
  val school: String = "atqinghua"

  def main(args: Array[String]): Unit = {
    val alisa = new Student("alisa", 20)
    val bob = new Student("bob", 23)
    alisa.printinfo()
    bob.printinfo()
  }
}
