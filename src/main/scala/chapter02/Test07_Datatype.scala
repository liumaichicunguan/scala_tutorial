package chapter02

import chapter01.Student

import scala.runtime.Nothing$

object Test07_Datatype {
  def main(args: Array[String]): Unit = {

    val a1: Byte = 127
    val a2: Byte = -128

    // 浮点默认是Double类型，整数默认是Int类型
    val f1: Float = 3.456f
    val f2: Double = 4345353.2435

    var b1: Byte = 10
    // 两个数值计算，结果在Byte范围内，可赋值给Byte类型
    val b2: Byte = 10 + 20
    println(b2)
    // 通过变量计算的结果，不能直接转换，需要通过方法进行
    val b3: Byte = (b1 + 20).toByte
    println(b3)

    // 字符类型  对应的是Scall码
    val c1: Char = 'a'
    val c2: Char = '9'
    println(c1)
    println(c2)

    // 特殊字符
    val c3: Char = '\t'
    val c4: Char = '\n'

    println("abc" + c3 + "dcg")
    println("abc" + c4 + "dcg")

    val i1: Int = c1
    val i2: Int = c2

    println("i1: " + i1)
    println("i2: " + i2)

    println(i1 + 1)

    val c5: Char = (i1 + 1).toChar
    val c6: Char = (i2 - 1).toChar

    println("c5: " + c5)
    println("c6: " + c6)

    // 布尔类型
    var isTrue: Boolean = true
    println(isTrue)

    // 使用Unit
    def m1(): Unit = {
      println("m1被调用")
    }

    val ma: Unit = m1()
    println("ma: " + ma)

    // 使用Null
    var bob: Student = new Student("bob", 20)
    bob = null
    println("bob: " + bob)

    // Nothing
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      return n
    }

    var mb = m2(2)
    println("mb: " + mb)
  }

}
