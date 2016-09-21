// to run:
// scalac p08.scala && scala P08

object P08 extends App {

	def compress[A](list: List[A]): List[A] =
		list.foldLeft(List[A]())((l, a) => if (l.lastOption == Some(a)) l else l:+a )

	assert(
		compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
		List('a, 'b, 'c, 'a, 'd, 'e)
	)
}
