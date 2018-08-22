import com.dacamo76.algorithms.DCTree

val tree: DCTree[Int] = DCTree(5)

val tree2 = tree.addLeft(DCTree(1))

val tree3 = tree2.right.map(_.addRight(DCTree(9)))

val tree4 = tree3.fold(tree2){
  tree2.addRight
}

println(tree4)