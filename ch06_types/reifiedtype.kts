abstract class Book(val name: String)
class Fiction(name: String) : Book(name)
class NonFiction(name: String) : Book(name)

val books: List<Book> = listOf(Fiction("Moby Dick"), NonFiction("Learn to Code"), Fiction("LOTR"))

/*
fun <T> findFirst(books: List<Book>, ofClass: Class<T>): T {
    val selected = books.filter { book -> ofClass.isInstance(book) }
    if (selected.size == 0) {
        throw RuntimeException("Not found")
    }

    return ofClass.cast(selected[0])
}

println(findFirst(books, NonFiction::class.java).name) // Learn to Code
*/

inline fun <reified T> findFirst(books: List<Book>): T {
    val selected = books.filter { book -> book is T }
    if (selected.size == 0) {
        throw RuntimeException("Not found")
    }

    return selected[0] as T
}

println(findFirst<NonFiction>(books).name) // Learn to Code