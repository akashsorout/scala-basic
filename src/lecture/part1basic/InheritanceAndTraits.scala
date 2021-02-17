package lecture.part1basic

object InheritanceAndTraits extends App{

  class Animal{
    def eat = println ("Some")
  }

  class Cat extends Animal

  val cat = new Cat

  cat.eat
}
