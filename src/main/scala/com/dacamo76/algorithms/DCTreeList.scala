package com.dacamo76.algorithms

case class DCTreeList[A](value: A, left0: DCTree[A], right0: DCTree[A]) extends DCTree[A] {
  override val left: Option[DCTree[A]] = Option(left0)
  override val right: Option[DCTree[A]] = Option(right0)
}

case class DCTreeListLeaf[A](value: A) extends DCTree[A] {
  override val left: Option[DCTree[A]] = None
  override val right: Option[DCTree[A]] = None
}

case class DCTreeListEmptyLeft[A](value: A, right0: DCTree[A]) extends DCTree[A] {
  override val left: Option[DCTree[A]] = None
  override val right: Option[DCTree[A]] = Option(right0)
}

case class DCTreeListEmptyRight[A](value: A, left0: DCTree[A]) extends DCTree[A] {
  override val left: Option[DCTree[A]] = Option(left0)
  override val right: Option[DCTree[A]] = None
}
