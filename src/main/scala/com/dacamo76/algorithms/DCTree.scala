package com.dacamo76.algorithms


object DCTree {

  def addRight[A](tree: DCTree[A], node: A): DCTree[A] = tree.addRight(DCTree[A](node))
  def addLeft[A](tree: DCTree[A], node: A): DCTree[A] = tree.addLeft(DCTree[A](node))

  def apply[A](value: A): DCTree[A] = DCTreeListLeaf(value)

  def apply[A](value: A, left: Option[DCTree[A]], right: DCTree[A]): DCTree[A] =
    left.fold[DCTree[A]](DCTreeListEmptyLeft(value, right)) {
      DCTreeList(value, _, right)
    }

  def apply[A](value: A, left: DCTree[A], right: Option[DCTree[A]]): DCTree[A] =
    right.fold[DCTree[A]](DCTreeListEmptyRight(value, left)) {
      DCTreeList(value, left, _)
    }


  def bfs[A](node: DCTree[A], needle: A): Boolean = {
    true
  }
}

trait DCTree[A] {

  def left: Option[DCTree[A]]
  def right: Option[DCTree[A]]
  def value: A

  def addLeft(tree: DCTree[A]): DCTree[A] = DCTree(value, tree, right)
  def addRight(tree: DCTree[A]): DCTree[A] = DCTree(value, left, tree)
}
